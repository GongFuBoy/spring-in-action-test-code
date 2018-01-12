package com.github.gongfuboy.chapter2;

/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 16:10
 */
public class WorkNameBean {

    private int age;

    private String description;

    public void print() {
        System.out.println("age:" + age + ";description:" + description);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
