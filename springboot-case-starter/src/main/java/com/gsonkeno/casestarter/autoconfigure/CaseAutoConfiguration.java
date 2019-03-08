package com.gsonkeno.casestarter.autoconfigure;

import com.ctrip.framework.apollo.Apollo;
import com.gsonkeno.casestarter.config.ACaseConfiguration;
import com.gsonkeno.casestarter.config.BCaseConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * "案例“自动配置
 * @author gaosong
 * @since 2019/3/8
 */
@Configuration
@EnableConfigurationProperties(CaseProperties.class)
//当Apollo.class在类路径下，这个自动配置类才生效
//@ConditionalOnClass(Apollo.class)

//当使用@Import引入的是@Configuration类时，这些配置类将会被容器收纳
@Import({ACaseConfiguration.class})
public class CaseAutoConfiguration {

    @Bean
    //当类路径下没有该类时，容器才引入CaseManager bean
    //@ConditionalOnMissingClass("java.lang.String")
    public CaseManager caseManager(){
        return new CaseManager();
    }
}
