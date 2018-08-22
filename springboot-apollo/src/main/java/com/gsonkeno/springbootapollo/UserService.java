package com.gsonkeno.springbootapollo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    public void set1(){
        User user = new User();
        user.setAge(20);
        user.setName("天下");
        user.setId(1);
        stringRedisTemplate.opsForValue().set(user.getId() + "", user.toString());
    }

    public void set2(){
        User user = new User();
        user.setAge(20);
        user.setName("天下");
        user.setId(2);
        ValueOperations<Integer, User> ops = redisTemplate.opsForValue();
        ops.set(user.getId(), user);
    }
}
