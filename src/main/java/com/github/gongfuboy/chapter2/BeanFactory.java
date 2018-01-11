package com.github.gongfuboy.chapter2;


/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 14:47
 */
public class BeanFactory {

    private static BeanFactory beanFactory;

    private BeanFactory() {
    }

    public static BeanFactory instance() {
        if (beanFactory == null) {
            synchronized (BeanFactory.class) {
                if (beanFactory == null) {
                    beanFactory = new BeanFactory();
                }
            }
        }
        return beanFactory;
    }
}
