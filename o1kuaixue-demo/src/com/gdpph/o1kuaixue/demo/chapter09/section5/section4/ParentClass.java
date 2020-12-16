package com.gdpph.o1kuaixue.demo.chapter09.section5.section4;

/**
 * 父类
 * @author 零壹学堂
 */
public class ParentClass {
    public void print() {
        System.out.println("继承父类的方法");
    }

    public final void finalPrint() {
        System.out.println("继承父类的final方法");
    }

    private final void privatePrint() {
        System.out.println("不能被继承的final方法");
    }
}
