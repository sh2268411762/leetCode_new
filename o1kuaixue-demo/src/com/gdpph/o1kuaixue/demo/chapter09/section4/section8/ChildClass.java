package com.gdpph.o1kuaixue.demo.chapter09.section4.section8;

/**
 * 子类——使用this关键字
 * @author 零壹学堂
 */
public class ChildClass extends ParentClass {
    public String name = "子类成员属性";

    public void method() {
        System.out.println("子类成员方法");
    }
    public void printMethod() {
        System.out.println(this.name);
        System.out.println(super.name);
        this.method(); // 调用子类的成员方法
        super.method(); // 调用父类的成员方法
    }
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.printMethod();
    }
}
