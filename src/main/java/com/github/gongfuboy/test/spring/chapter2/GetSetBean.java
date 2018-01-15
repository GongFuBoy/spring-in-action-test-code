package com.github.gongfuboy.test.spring.chapter2;

/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 15:58
 */
public class GetSetBean {

    private Object ref;

    private int age;

    private String description;

    public void print() {
        System.out.println("ref:" + ref);
        System.out.println("age:" + age);
        System.out.println("description:" + description);
    }

    public Object getRef() {
        return ref;
    }

    public void setRef(Object ref) {
        this.ref = ref;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
