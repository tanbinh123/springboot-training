package com.gsonkeno.springbootproperties;


public class RedisFactory {

    private RedisProperties redisProperties;

    public RedisFactory (){
        System.out.println(redisProperties.getHost());
    }
}
