package com.gsonkeno.springbootmybatismultidb;

import com.gsonkeno.springbootmybatismultidb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMybatisMultiDbApplication  implements ApplicationRunner {
    @Autowired
    private UserService userService;
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisMultiDbApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(userService.findByName("gaosong"));
    }
}
