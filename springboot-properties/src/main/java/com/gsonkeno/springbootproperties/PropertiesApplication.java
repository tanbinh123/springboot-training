package com.gsonkeno.springbootproperties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Iterator;

/**
 * CommandLineRunner接口类似于Spring中的ApplicationListener接口
 * SpringBoot容器启动完成后，将会执行接口中定义的run方法
 */
@SpringBootApplication
@EnableConfigurationProperties(CompanyProperties.class)
public class PropertiesApplication implements CommandLineRunner {

//    @Autowired
//    private HomeProperties homeProperties;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PropertiesApplication.class, args);
        Iterator<String> beanNames = context.getBeanFactory().getBeanNamesIterator();
        while (beanNames.hasNext()){
            System.out.println(beanNames.next());
        }

    }

    @Override
    public void run(String... args) throws Exception {
       // System.out.println(homeProperties);
    }
}
