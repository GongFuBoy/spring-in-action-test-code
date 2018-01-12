package com.github.gongfuboy.chapter3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongFuBoy
 * @date 2018/1/12
 * @time 17:44
 */
public class TestApple {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter3/spring-byname.xml");
        Apple apple = (Apple) applicationContext.getBean("apple");
        System.out.println(apple);
    }

}
