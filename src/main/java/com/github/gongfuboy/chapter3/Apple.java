package com.github.gongfuboy.chapter3;

/**
 * @author GongFuBoy
 * @date 2018/1/12
 * @time 17:39
 */
public class Apple {

    private Banana banana;

    private String description;

    @Override
    public String toString() {
        return "Apple{" +
                "banana=" + banana +
                ", description='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Banana getBanana() {
        return banana;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }
}
