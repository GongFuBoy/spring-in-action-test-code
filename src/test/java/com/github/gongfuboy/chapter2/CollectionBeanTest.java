package com.github.gongfuboy.chapter2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 16:47
 */
public class CollectionBeanTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter2/spring-collection.xml");
        CollectionBean bean = (CollectionBean) applicationContext.getBean("collecion-bean");
        bean.print();
    }

}
