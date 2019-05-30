package com.gsonkeno.springbootsession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * https://docs.spring.io/spring-session/docs/current/reference/html5/guides/boot-redis.html
 * @author gaosong
 * @since 2019-05-30
 */

// spring.session.store-type = redis等价于@EnableRedisHttpSession注解
// 这将创建一个Spring bean，其名称为springSessionRepositoryFilter implements Filter。
// 过滤器负责替换HttpSessionSpring Session支持的实现

@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800)
@SpringBootApplication
public class SpringbootSessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSessionApplication.class, args);
    }

}
