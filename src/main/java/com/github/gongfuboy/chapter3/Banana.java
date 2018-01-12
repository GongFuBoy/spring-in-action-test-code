package com.github.gongfuboy.chapter3;

/**
 * @author GongFuBoy
 * @date 2018/1/12
 * @time 17:40
 */
public class Banana {

    private String description;

    @Override
    public String toString() {
        return "Banana{" +
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
