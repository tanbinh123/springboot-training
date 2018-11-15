package com.gsonkeno.springbootproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CommandLineRunner接口类似于Spring中的ApplicationListener接口
 * SpringBoot容器启动完成后，将会执行接口中定义的run方法
 */
@SpringBootApplication
public class SpringbootPropertiesApplication implements CommandLineRunner {

//    @Autowired
//    private HomeProperties homeProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPropertiesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       // System.out.println(homeProperties);
    }
}
