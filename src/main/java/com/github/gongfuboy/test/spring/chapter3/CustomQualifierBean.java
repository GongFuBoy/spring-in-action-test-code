package com.github.gongfuboy.test.spring.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author GongFuBoy
 * @date 2018/1/15
 * @time 15:07
 */
public class CustomQualifierBean {

    @Autowired
    @CustomQualifier
    private Serializable serializable;

    @Value("#{T(java.lang.Integer).valueOf(1)}")
    private BigDecimal bigDecimal;

    @Override
    public String toString() {
        return "CustomQualifierBean{" +
                "serializable=" + serializable +
                '}';
    }
}
