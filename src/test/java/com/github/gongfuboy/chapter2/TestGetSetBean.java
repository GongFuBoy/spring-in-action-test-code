package com.github.gongfuboy.chapter2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 16:02
 */
public class TestGetSetBean {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter2/spring-setter-getter.xml");
        GetSetBean bean = (GetSetBean) applicationContext.getBean("set-get-bean");
        bean.print();
    }

}
