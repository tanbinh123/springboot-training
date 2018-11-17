package com.gsonkeno.springbootproperties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * CommandLineRunner接口类似于Spring中的ApplicationListener接口
 * SpringBoot容器启动完成后，将会执行接口中定义的run方法
 */
@SpringBootApplication
public class SpringbootPropertiesApplication implements CommandLineRunner {

//    @Autowired
//    private HomeProperties homeProperties;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootPropertiesApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
       // System.out.println(homeProperties);
    }
}
