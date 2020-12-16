package com.gdpph.o1kuaixue.demo.chapter09.section4.section12;

/**
 * 向上类型转换示例-子类
 * @author 零壹学堂
 */
public class ChildClass extends ParentClass {
    public void childMethod() {
        System.out.println("只在子类中定义的方法");
    }

    public static void main(String[] args) {
        ParentClass child = new ChildClass(); // 向上类型转换
//        child.childMethod(); // 编译报错
    }
}
