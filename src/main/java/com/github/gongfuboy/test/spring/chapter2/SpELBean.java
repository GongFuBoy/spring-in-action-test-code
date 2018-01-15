package com.github.gongfuboy.test.spring.chapter2;

/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 17:39
 */
public class SpELBean {

    private int age;

    private Object temp;

    private Class<?> clazz;

    private double PI;

    private double random;

    @Override
    public String toString() {
        return "SpELBean{" +
                "age=" + age +
                ", temp=" + temp +
                ", clazz=" + clazz +
                ", PI=" + PI +
                ", random=" + random +
                '}';
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRandom() {
        return random;
    }

    public void setRandom(double random) {
        this.random = random;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object getTemp() {
        return temp;
    }

    public void setTemp(Object temp) {
        this.temp = temp;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }
}
