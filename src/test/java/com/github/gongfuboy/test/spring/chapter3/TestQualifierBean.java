package com.github.gongfuboy.test.spring.chapter3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongFuBoy
 * @date 2018/1/15
 * @time 14:52
 */
public class TestQualifierBean {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter3/spring-qualifier.xml");
        QualifierBean quelifierBean = (QualifierBean) applicationContext.getBean("quelifierBean");
        System.out.println(quelifierBean);
    }

}
