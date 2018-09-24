package com.imooc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.imooc.demo"})
public class SpringApplications {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplications.class, args);
    }
}
