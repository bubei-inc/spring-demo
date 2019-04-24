package com.cn.spring.demo.gateway.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableEurekaClient
@EnableWebSecurity
public class GatewayServcieApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayServcieApplication.class).web(true).run(args);
    }
}
