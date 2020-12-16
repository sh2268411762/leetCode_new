package com.gdpph.o1kuaixue.demo.chapter09.section4.section7;

/**
 * 子类——参数传入父类构造方法
 * @author 零壹学堂
 */
public class ChildClass extends ParentClass {
    ChildClass(String name) {
        super(name);
    }
    public static void main(String[] args) {
        ChildClass child = new ChildClass("传入名称");
    }
}
