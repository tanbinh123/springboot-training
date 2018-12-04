package com.gsonkeno.springbootredis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义注解配置类
 * @author gaosong
 * @since 2018-12-04
 */
@Configuration
public class CustomerConfiguration {

    @Bean
    public Lecture lecture(){
        return new Lecture();
    }
}
