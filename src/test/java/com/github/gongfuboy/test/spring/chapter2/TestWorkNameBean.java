package com.github.gongfuboy.test.spring.chapter2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 16:24
 */
public class TestWorkNameBean {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter2/spring-work-name.xml");
        WorkNameBean bean = (WorkNameBean) applicationContext.getBean("work-name-bean");
        bean.print();
    }

}
