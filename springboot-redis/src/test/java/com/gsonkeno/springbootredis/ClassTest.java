package com.gsonkeno.springbootredis;

import org.junit.Test;

/**
 * 类基本操作
 */
public class ClassTest {

    @Test
    public void test(){
        for(Class clazz:RedisApplication.class.getDeclaredClasses()){
            System.out.println(clazz);
        }
    }
}
