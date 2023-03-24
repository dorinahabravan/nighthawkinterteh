package com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().and()
                .authorizeRequests()
                .antMatchers("/admin/home").hasRole("ADMIN")
                .antMatchers("/usersubcontractor/home").hasRole("SUBCONTRACTOR")
                .antMatchers("/userpayroll/home").hasRole("PAYROLL")
                //                .antMatchers("/usersubcontractor/**").access("hasRole('SUBCONTRACTOR')")
                //                .antMatchers("/admin/**").access("hasRole('ADMIN')")
                //                .antMatchers("/userpayroll/**").access("hasRole('PAYROLL')")
                //                .anyRequest().authenticated()
                //                .and()
                //                .formLogin()
                //                .loginPage("/login")
                //                .defaultSuccessUrl("/")
                //                .permitAll()
                //                .and()
                //                .logout()
                //                .permitAll();

                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
                .permitAll();
    }

    /**
     *
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().
                withUser("subcontractor").password(passwordEncoder().encode("888")).roles("SUBCONTRACTOR")
                .and().
                withUser("admin83").password(passwordEncoder().encode("83")).roles("ADMIN")
                .and().
                withUser("payroll").password(passwordEncoder().encode("123")).roles("PAYROLL");

    }

}
