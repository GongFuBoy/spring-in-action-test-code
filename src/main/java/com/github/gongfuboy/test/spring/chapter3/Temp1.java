package com.github.gongfuboy.test.spring.chapter3;

/**
 * @author GongFuBoy
 * @date 2018/1/15
 * @time 10:56
 */
public class Temp1 {

    private String description;

    @Override
    public String toString() {
        return "Temp1{" +
                "description='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
