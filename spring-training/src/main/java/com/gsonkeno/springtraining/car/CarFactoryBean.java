package com.gsonkeno.springtraining.car;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {
    public Car getObject() throws Exception {
        Car car = new Car();
        car.setName("宝马");
        car.setPrice(872f);
        return car;
    }

    public Class<?> getObjectType() {
        return Car.class;
    }
}
