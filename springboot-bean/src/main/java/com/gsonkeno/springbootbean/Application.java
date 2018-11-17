package com.gsonkeno.springbootbean;

import com.gsonkeno.springbootbean.bean.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    private static final Log log = LogFactory.getLog(User.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        int age = context.getBean(User.class).getAge();
        log.info("-------------------");
        log.info("容器中获取 user.age = " + age);
        log.info("-------------------");
    }
}
