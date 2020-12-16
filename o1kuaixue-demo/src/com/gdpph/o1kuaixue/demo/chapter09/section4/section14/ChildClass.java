package com.gdpph.o1kuaixue.demo.chapter09.section4.section14;

/**
 * instanceof判断一个对象是否是一个类的实例
 * @author 零壹学堂
 */
public class ChildClass extends ParentClass {
    public static void main(String[] args) {
        ParentClass child1 = new ParentClass();
        if(child1 instanceof ParentClass) {
            System.out.println("child1为ParentClass的实例对象");
        }
        if(child1 instanceof ChildClass) {
            System.out.println("child1为ChildClass的实例对象");
        }
        ParentClass child2 = new ChildClass();
        if(child2 instanceof ParentClass) {
            System.out.println("child2为ParentClass的实例对象");
        }
        if(child2 instanceof ChildClass) {
            System.out.println("child2为ChildClass的实例对象");
        }
    }
}
