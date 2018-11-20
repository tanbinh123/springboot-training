package com.gsonkeno.springbootbean.model;

/**
 * 课程
 * @author gaosong
 * @since 2018-11-19
 */
public class Lecture {

    /**课程名称**/
    private String name;

    /**课时**/
    private int hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
