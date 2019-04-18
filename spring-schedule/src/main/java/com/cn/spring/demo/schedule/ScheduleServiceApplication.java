package com.cn.spring.demo.schedule;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ScheduleServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ScheduleServiceApplication.class).web(true).run(args);
    }
}
