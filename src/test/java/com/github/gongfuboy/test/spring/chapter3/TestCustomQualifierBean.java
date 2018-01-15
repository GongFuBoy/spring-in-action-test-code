package com.github.gongfuboy.test.spring.chapter3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongFuBoy
 * @date 2018/1/15
 * @time 15:15
 */
public class TestCustomQualifierBean {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter3/spring-custom-qualifier.xml");
        Object customQualifierBean = applicationContext.getBean("customQualifierBean");
        System.out.println(customQualifierBean);
    }

}
