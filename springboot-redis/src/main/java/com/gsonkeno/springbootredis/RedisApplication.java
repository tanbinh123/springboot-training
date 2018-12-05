package com.gsonkeno.springbootredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties({Student.class})
//@EnableCaching
public class RedisApplication implements ApplicationRunner {

    @Autowired
    private UserService service;

    @Autowired
    private Student student;

    @Autowired
    private Father father;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RedisApplication.class, args);
        System.out.println(context);

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //service.set2();
        System.out.println(student.getName());
        System.out.println(father.getAge());

    }

    /**
     * 设置 redisTemplate 的序列化设置
     * @param redisConnectionFactory
     * @return
     */
//    @Bean
//    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        System.out.println(redisConnectionFactory);
//        // 1.创建 redisTemplate 模版
//        RedisTemplate<Object, Object> template = new RedisTemplate<>();
//        // 2.关联 redisConnectionFactory
//        template.setConnectionFactory(redisConnectionFactory);
//        // 3.创建 序列化类
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//        ObjectMapper om = new ObjectMapper();
//        // 4.设置可见度
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        // 5.启动默认的类型
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        // 6.序列化类，对象映射设置
//        jackson2JsonRedisSerializer.setObjectMapper(om);
//        // 7.设置 value 的转化格式和 key 的转化格式
//        template.setValueSerializer(jackson2JsonRedisSerializer);
//        template.setKeySerializer(new StringRedisSerializer());
//        template.afterPropertiesSet();
//
//        template.opsForValue().set("name","lhao");
//        return template;
//    }

    private class InnerApplication{
        private String inner;
    }

}
