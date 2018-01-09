package com.github.gongfuboy.chapter1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GongFuBoy
 * @date 2018/1/9
 * @time 16:59
 */
public class TestHuman {

    @Test
    public void testHuman() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Human human = (Human) applicationContext.getBean("human");
        human.printHand();
    }

}
