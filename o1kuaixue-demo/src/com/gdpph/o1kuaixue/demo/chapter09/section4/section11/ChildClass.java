package com.gdpph.o1kuaixue.demo.chapter09.section4.section11;

/**
 * 向上类型转换示例-子类
 * @author 零壹学堂
 */
public class ChildClass extends ParentClass {
    public void print() {
        System.out.println("子类方法");
    }
    public static void main(String[] args) {
        ParentClass child = new ChildClass(); // 向上类型转换
        child.print();
    }
}
