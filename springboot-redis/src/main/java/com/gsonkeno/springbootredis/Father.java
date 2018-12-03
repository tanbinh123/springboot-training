package com.gsonkeno.springbootredis;

import org.springframework.stereotype.Component;

@Component
public class Father {
    private int age = 30;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Father() {
        System.out.println("father age is " + age);
    }
}
