package com.github.gongfuboy.chapter3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongFuBoy
 * @date 2018/1/15
 * @time 10:57
 */
public class TestByTypeBean {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter3/spring-bytype.xml");
        ByTypeBean byTypeBean = (ByTypeBean) applicationContext.getBean("byTypeBean");
        System.out.println(byTypeBean);
    }
}
