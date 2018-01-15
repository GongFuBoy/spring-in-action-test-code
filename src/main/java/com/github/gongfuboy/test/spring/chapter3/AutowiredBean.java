package com.github.gongfuboy.test.spring.chapter3;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author GongFuBoy
 * @date 2018/1/15
 * @time 11:38
 */
public class AutowiredBean {

    // 这里使用autowired修饰私有的成员变量，可以去除getter/setter方法，然后进行byType进行装配
    @Autowired
    private Temp1 temp1;

    public AutowiredBean() {
    }

    // 修饰成员变量，那么使用construction-arg进行自动装配
    @Autowired
    public AutowiredBean(Temp1 temp1) {
        this.temp1 = temp1;
    }


    public Temp1 getTemp1() {
        return temp1;
    }

    // 这里修饰普通方法，同样也是使用ByType进行装配
    @Autowired
    public void modifyTemp1(Temp1 temp1) {
        this.temp1 = temp1;
    }

    // 这里修饰普通方法，同样也是使用ByType进行装配
    @Autowired
    public void setTemp1(Temp1 temp1) {
        this.temp1 = temp1;
    }
}
