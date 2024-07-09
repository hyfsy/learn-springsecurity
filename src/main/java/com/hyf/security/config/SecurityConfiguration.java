package com.hyf.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author baB_hyf
 * @date 2022/04/14
 */
@Configuration
@EnableWebSecurity
// @EnableGlobalAuthentication
// @EnableMethodSecurity
// @EnableGlobalMethodSecurity
// @EnableRSocketSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll()
        ;
    }

    // @Override
    // protected UserDetailsService userDetailsService() {
    //     UserDetails userDetails = User.withUsername("hyf")
    //             .password("11111")
    //             .roles("user")
    //             .build();
    //     return new InMemoryUserDetailsManager(userDetails);
    // }
}
