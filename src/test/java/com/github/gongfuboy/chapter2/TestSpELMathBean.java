package com.github.gongfuboy.chapter2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongFuBoy
 * @date 2018/1/12
 * @time 16:31
 */
public class TestSpELMathBean {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("chapter2/spring-spel-math.xml");
        SpELMathBean bean = (SpELMathBean) applicationContext.getBean("sp-el-math-bean");
        System.out.println(bean);
    }

}
