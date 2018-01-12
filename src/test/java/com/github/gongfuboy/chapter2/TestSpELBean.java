package com.github.gongfuboy.chapter2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 17:42
 */
public class TestSpELBean {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter2/spring-spel.xml");
        SpELBean bean = (SpELBean) applicationContext.getBean("spel-bean");
        System.out.println(bean);
    }
}
