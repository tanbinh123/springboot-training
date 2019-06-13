package com.gsonkeno.springtraining.car;

import com.gsonkeno.springtraining.config.CarConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarMain {
    public static void main(String[] args) {

        //使用Config.class这个配置类
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarConfig.class);

        System.out.println(applicationContext.getBean("getCarFactoryBean"));
        System.out.println(applicationContext.getBean("&getCarFactoryBean"));

        System.out.println(applicationContext.getBean(Car.class));
        System.out.println(applicationContext.getBean(CarFactoryBean.class));

        applicationContext.close();
    }
}
