package com.inventory.hiai.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // TODO: Configure security rules
        http.anonymous()
                .and()
                .authorizeRequests()
                .anyRequest()
                .permitAll()
                .and()
                .csrf().disable();
    }

}
