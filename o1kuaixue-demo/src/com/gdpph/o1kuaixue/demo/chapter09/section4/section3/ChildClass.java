package com.gdpph.o1kuaixue.demo.chapter09.section4.section3;

/**
 * 子类继承父类方法
 * @author 零壹学堂
 */
public class ChildClass extends ParentClass {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        System.out.println("子类继承父类方法："+child.parentMethod());
    }
}
