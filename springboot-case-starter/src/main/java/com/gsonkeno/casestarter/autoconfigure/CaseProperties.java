package com.gsonkeno.casestarter.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "gsonkeno.case")
public class CaseProperties {
    /**案例名称**/
    String name;

    /**案例时间**/
    String time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
