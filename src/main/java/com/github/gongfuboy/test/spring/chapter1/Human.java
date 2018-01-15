package com.github.gongfuboy.test.spring.chapter1;

/**
 * 简单人类
 *
 * @author GongFuBoy
 * @date 2018/1/9
 * @time 16:54
 */
public class Human {

    // hand引用
    private Hand hand;

    public void printHand() {
        hand.printMyself();
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
