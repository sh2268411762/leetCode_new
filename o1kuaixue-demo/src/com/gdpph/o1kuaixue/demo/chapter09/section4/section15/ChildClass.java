package com.gdpph.o1kuaixue.demo.chapter09.section4.section15;

/**
 * instanceof编译失败
 * @author 零壹学堂
 */
public class ChildClass{
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
//        if(child instanceof OtherClass) {
            System.out.println("这里不会执行，编译失败不会通过");
        }
    }
//}
