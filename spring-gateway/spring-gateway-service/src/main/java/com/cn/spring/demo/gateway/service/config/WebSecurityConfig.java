package com.cn.spring.demo.gateway.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity
public class WebSecurityConfig {
    @Configuration
    public static class ApiWebSecurityAdapter extends WebSecurityConfigurerAdapter{
        @Override
        public void configure(WebSecurity webSecurity) {
            webSecurity.ignoring().antMatchers("/admin/api/*/password");
        }

    }

}
