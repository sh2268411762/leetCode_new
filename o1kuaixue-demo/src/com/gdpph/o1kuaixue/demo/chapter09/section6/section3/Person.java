package com.gdpph.o1kuaixue.demo.chapter09.section6.section3;

/**
 * 具体实现抽象类
 * @author 零壹学堂
 */
public class Person extends ChildClass{
    @Override
    public void parentMethod() {
        System.out.println("实现父类抽象类方法");
    }
    @Override
    public void childMethod() {
        System.out.println("实现子类抽象类方法");
    }

}
