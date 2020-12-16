package com.gdpph.o1kuaixue.demo.chapter09.section4.section13;

/**
 * 向下类型转换示例-子类
 * @author 零壹学堂
 */
public class ChildClass extends ParentClass {
    public void childMethod() {
        System.out.println("只在子类中定义的方法");
    }

    public static void main(String[] args) {
        ParentClass child = new ChildClass(); // 向上类型转换
        child.print();
        ChildClass childClass = (ChildClass) child; // 强制向下类型转换
        child.print();
        childClass.childMethod();
    }
}
