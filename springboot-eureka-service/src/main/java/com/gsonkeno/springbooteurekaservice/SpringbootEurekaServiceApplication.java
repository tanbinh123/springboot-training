package com.gsonkeno.springbooteurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurekaServiceApplication.class, args);
    }
}
