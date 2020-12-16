package com.gdpph.o1kuaixue.demo.chapter03.section1.section2;


// 这个一个主类
public class MainClass {
    private String desc;

    // 这个一个主方法
    public static void main(String[] args) {
        System.out.print("Hello,零壹学堂!\n");
        oneMethod();//调用oneMethod
        twoMethod();//调用twoMethod
    }

    private static void oneMethod() {
        System.out.print("这是一个方法\n");
    }

    private static void twoMethod() {
        System.out.print("这也是一个方法\n");
    }
}
