package com.gdpph.o1kuaixue.demo.chapter09.section5.section4;

/**
 * 子类
 * @author 零壹学堂
 */
public class ChildClass extends ParentClass {
    public final void privatePrint() {
        System.out.println("这不是继承自父类的方法，是子类自己定义的方法，只是碰巧名称相同");
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.print();
        child.finalPrint();
        child.privatePrint();
    }
}
