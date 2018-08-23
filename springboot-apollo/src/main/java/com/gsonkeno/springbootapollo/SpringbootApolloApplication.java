package com.gsonkeno.springbootapollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class SpringbootApolloApplication implements ApplicationRunner {

    @Autowired
    private UserService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApolloApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        service.set2();
    }
}
