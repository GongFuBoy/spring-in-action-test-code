package com.github.gongfuboy.test.spring.chapter3;

import java.io.Serializable;

/**
 * @author GongFuBoy
 * @date 2018/1/15
 * @time 15:10
 */
public class CustomQualifierBeanTempSource implements Serializable{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CustomQualifierBeanSource{" +
                "description='" + description + '\'' +
                '}';
    }

}
