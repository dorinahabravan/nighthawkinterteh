//package com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration;
//
//import org.springframework.context.annotation.*;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.*;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;  
//
///**
// *
// * @author Dorina
// */
//@EnableWebSecurity
//@ComponentScan("com.iucosoft")
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Bean
//
//    @Override
//    public UserDetailsService userDetailsService() {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withDefaultPasswordEncoder().username("admin").password("1234").roles("ADMIN").build());
//        return manager;
//
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.authorizeRequests()
//.anyRequest()
//.hasRole("ADMIN")
//.and().formLogin()
//.and()
//.logout()
//.logoutUrl("/j_spring_security_logout")
//.logoutSuccessUrl("/");
//
//    }
//
//}
