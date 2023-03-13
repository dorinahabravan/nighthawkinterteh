//package com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//
//@Configuration
//@EnableGlobalAuthentication
//@EnableWebSecurity
////@ComponentScan(basePackages = {"com.iucosoft"})
//@EnableGlobalMethodSecurity(prePostEnabled=true, proxyTargetClass=true)
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
////        @Autowired
////    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////        auth.inMemoryAuthentication()
//////            .withUser("subcontractor").password("888").roles("SUBCONTRACTOR")
//////            .and()
////            .withUser("admin").password("parola").roles("ADMIN");
//////            .and()
//////            .withUser("payroll").password("123").roles("PAYROLL");
////    }
//////    @Autowired
//////    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//////        auth.inMemoryAuthentication()
////////            .withUser("subcontractor").password("888").roles("SUBCONTRACTOR")
////////            .and()
//////            .withUser("admin83").password("83").authorities("ADMIN");
////////            .and()
////////            .withUser("payroll").password("123").roles("PAYROLL");
//////    }
//////
////    
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http
//////                .csrf().disable()
////            .authorizeRequests()
////                .antMatchers("/admin").access("hasRole('ADMIN')")
//////                .antMatchers("/usersubcontractor/subcontrcontracts").hasRole("SUBCONTRACTOR")
//////                .antMatchers("/userpayroll/home").hasRole("PAYROLL")
////                .and()
////            .formLogin().loginPage("/login")
//////            .defaultSuccessUrl("/admin/home")
//////                .usernameParameter("username").passwordParameter("password")
////                .and()
////            .logout()
////                .logoutSuccessUrl("/logout");
////        
////    }
////    PasswordEncoder passwordEncoder =
////    PasswordEncoderFactories.createDelegatingPasswordEncoder();
////    @Autowired
////    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////      auth.inMemoryAuthentication().
//////                    withUser("user").password("{noop}password1").roles("USER")
//////                .and()
////                    withUser("admin").password("{noop}password2").roles("ADMIN");
////    }
//    
//    
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
//        authenticationMgr.inMemoryAuthentication()
//                .withUser("admin123")
//                .password("123444")
//                .authorities("USER", "ADMIN");
//    }
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.sessionManagement()
////                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
////                .and()
////                .authorizeRequests()
////                .antMatchers("/index.html", "/view/**", "/").permitAll()
////                .antMatchers("/admin/home").hasRole("ADMIN")
////                .mvcMatchers("/", "/login").permitAll()
////                .anyRequest().authenticated()
////                .and()
////                .formLogin().loginPage("/login")
////                .defaultSuccessUrl("/")
////                .failureUrl("/login?error")
////                .usernameParameter("username").passwordParameter("password")
////                .and()
////                .logout().logoutSuccessUrl("/login?logout")
////                .and()
////                .httpBasic()
////                .and()
////                .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
////
////    }
//    
//    
//     @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();// We don't need sessions to be created.
//    }
//
//}
