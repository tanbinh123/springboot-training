package com.gsonkeno.springbootproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.redis")
public class RedisProperties {

    private String host = "localhost";


    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        System.out.println("set host " + host);
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println("set password " + password);
        this.password = password;
    }
}
