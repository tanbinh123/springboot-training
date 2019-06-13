package com.gsonkeno.springtraining.config;

import com.gsonkeno.springtraining.car.CarFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CarConfig {

    @Bean
    public CarFactoryBean getCarFactoryBean(){
        return  new CarFactoryBean();
    }
}
