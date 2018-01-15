package com.github.gongfuboy.test.spring.chapter2;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author GongFuBoy
 * @date 2018/1/11
 * @time 16:40
 */
public class CollectionBean {

    private List<String> list;

    private Set<Object> set;

    private Map<String, Object> map;

    private Properties properties;

    public void print() {
        System.out.println("list:" + list);
        System.out.println("set:" + set);
        System.out.println("map:" + map);
        System.out.println("properties:" + properties);
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<Object> getSet() {
        return set;
    }

    public void setSet(Set<Object> set) {
        this.set = set;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
