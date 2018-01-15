package com.github.gongfuboy.test.spring.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author GongFuBoy
 * @date 2018/1/15
 * @time 14:49
 */
// 这样做和标签中使用<qualifier>是一样的效果
@Qualifier("test1")
public class QualifierBean {

    @Autowired
    @Qualifier("temp1")
    private Temp1 temp1;

    @Override
    public String toString() {
        return "QualifierBean{" +
                "temp1=" + temp1 +
                '}';
    }
}
