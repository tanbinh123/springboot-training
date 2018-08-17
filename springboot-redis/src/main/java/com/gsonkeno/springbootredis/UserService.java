package com.gsonkeno.springbootredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    private StringRedisTemplate redisTemplate;

    public void set(){
        User user = new User();
        user.setAge(20);
        user.setName("天下");
        user.setId(1);
        redisTemplate.opsForValue().set(user.getId() + "", user.toString());
    }
}
