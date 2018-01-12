package com.github.gongfuboy.chapter2;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 15:40
 */
public class TestInitAndDesMethodBean {

    @Test
    public void test() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter2/spring-init-destroy.xml");
        InitAndDesMethodBean bean = (InitAndDesMethodBean) applicationContext.getBean("init-des-method-bean");
        bean.simpleMethod();
        // 关闭容器，准备查看destroy方法的执行
        applicationContext.close();
    }

}
