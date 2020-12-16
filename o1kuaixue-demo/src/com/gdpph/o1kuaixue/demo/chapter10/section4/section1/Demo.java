package com.gdpph.o1kuaixue.demo.chapter10.section4.section1;

import java.util.List;

/**
 * 泛型类定义
 * @author 零壹学堂
 */
public class Demo<T> {
    private T name;
    private List<T> desc;
    /**
     * @param name the name to set
     */
    public void setName(T name) {
        this.name = name;
    }
    /**
     * @return the name
     */
    public T getName() {
        return name;
    }
    /**
     * @param desc the desc to set
     */
    public void setDesc(List<T> desc) {
        this.desc = desc;
    }
    /**
     * @return the desc
     */
    public List<T> getDesc() {
        return desc;
    }
}
