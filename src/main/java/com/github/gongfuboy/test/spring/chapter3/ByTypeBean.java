package com.github.gongfuboy.test.spring.chapter3;

/**
 * @author GongFuBoy
 * @date 2018/1/15
 * @time 10:52
 */
public class ByTypeBean {

    private Temp1 temp1;

    @Override
    public String toString() {
        return "ByTypeBean{" +
                "temp1=" + temp1 +
                '}';
    }

    public Temp1 getTemp1() {
        return temp1;
    }

    public void setTemp1(Temp1 temp1) {
        this.temp1 = temp1;
    }
}
