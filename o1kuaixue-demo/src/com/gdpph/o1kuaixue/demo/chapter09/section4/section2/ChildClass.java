package com.gdpph.o1kuaixue.demo.chapter09.section4.section2;

/**
 * 子类覆盖继承的父类属性
 * @author 零壹学堂
 */
public class ChildClass extends ParentClass {
    public String name = "子类名称";
    private String childName; //子类属性

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        System.out.println("子类覆盖父类属性：" + child.name);
    }
}
