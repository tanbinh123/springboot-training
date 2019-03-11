package com.gasonkeno.springbootcache.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "UserConfig")
/**
 * 用户服务
 * @author gaosong
 * @since 2019/3/8
 */
public class UserService {
    @Cacheable(value = "UserService", key = "targetClass + methodName +#p0")
    public String getUserInfo(String userName){
        String info = "age:20 and sex:男 and name:" + userName;
        return info;
    }
}
