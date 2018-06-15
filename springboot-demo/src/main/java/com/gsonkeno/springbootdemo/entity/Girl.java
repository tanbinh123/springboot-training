package com.gsonkeno.springbootdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Girl {
    /**
     * @GeneratedValue
     * 注解默认值是Auto，对于Mysql数据库而言，会维护一个
     * 全局的自增长的表hibernate_sequence作为主键序列计数器,所有的表的
     * 主键的值都从计数器取得，比如Jpa增加Girl和Student时，就永远
     * 不会有相同的主键值
     *
     * strategy = GenerationType.IDENTITY 该种情况下，将利用数据库的主键自增特性
     *
     * strategy = GenerationType.SEQUENCE  mysql不支持
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cupSize;

    private Integer age;

    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
