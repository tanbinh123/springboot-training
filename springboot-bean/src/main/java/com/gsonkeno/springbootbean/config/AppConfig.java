package com.gsonkeno.springbootbean.config;

import com.gsonkeno.springbootbean.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public User user(){
        return new User();
    }
}
