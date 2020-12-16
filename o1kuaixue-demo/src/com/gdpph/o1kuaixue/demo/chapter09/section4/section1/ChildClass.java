package com.gdpph.o1kuaixue.demo.chapter09.section4.section1;

/**
 * 子类
 * @author 零壹学堂
 */
public class ChildClass extends ParentClass {
    private String childName; //子类属性

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        System.out.println("子类继承父类属性：" + child.parentName);
    }
}
