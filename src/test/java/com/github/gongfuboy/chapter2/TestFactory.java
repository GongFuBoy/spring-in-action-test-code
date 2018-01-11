package com.github.gongfuboy.chapter2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 14:51
 */
public class TestFactory {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter2/spring-factory.xml");
        BeanFactory beanFactory = (BeanFactory) applicationContext.getBean("beanFactory");
        System.out.println(beanFactory.toString());
    }
}
