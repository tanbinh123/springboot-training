package com.gasonkeno.springbootcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;
import java.util.Iterator;

/**
 * 参考博客
 * @author gaosong
 * @since 2019/3/8
 */
@SpringBootApplication
@EnableCaching  //开启缓存
public class CacheApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CacheApplication.class, args);
        Iterator<String> beanNames = context.getBeanFactory().getBeanNamesIterator();
        while (beanNames.hasNext()){
            System.out.println(beanNames.next());
        }
    }

    @Bean
    public CacheManager cacheManager(@Autowired RedisConnectionFactory connectionFactory) {
        return RedisCacheManager
                .builder(connectionFactory)
                .cacheDefaults(RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(1)))
                .transactionAware()
                .build();
    }

}
