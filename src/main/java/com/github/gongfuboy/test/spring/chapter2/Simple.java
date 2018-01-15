package com.github.gongfuboy.test.spring.chapter2;

/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 14:29
 */
public class Simple {

    private int age;

    private Object temp;

    public Simple() {
    }

    public Simple(int age) {
        this.age = age;
    }

    public Simple(int age, Object temp) {
        this.age = age;
        this.temp = temp;
    }

    public void simple() {
        System.out.println("simple age is " + age);
    }
}
