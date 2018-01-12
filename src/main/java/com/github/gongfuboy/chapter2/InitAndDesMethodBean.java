package com.github.gongfuboy.chapter2;

/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 15:33
 */
public class InitAndDesMethodBean {

    private String initString;

    private String destroyString;

    public void init() {
        System.out.println("准备执行init方法");
        initString = "initString准备赋值";
        destroyString = "destoryString准备赋值";
        System.out.println("执行init方法结束");
    }

    public void destroy() {
        System.out.println("准备执行destroy方法");
        System.out.println("initString:" + initString + "; destroyString:" + destroyString);
        System.out.println("执行destroy方法结束");
    }

    public void simpleMethod() {
        System.out.println("执行普通方法开始");
        initString = null;
        destroyString = null;
        System.out.println("执行普通方法结束");
    }

}
