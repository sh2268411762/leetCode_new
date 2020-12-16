package com.gdpph.o1kuaixue.demo.chapter04.section3.section2;

/**
 * 固定参数方法被优先调用
 * @author 零壹学堂
 */
public class VariableMethod {
    public static void test(int number, String arg) {
        System.out.println("这是固定参数方法");
    }

    public static void test(int number, String... args) {
        System.out.println("这是可变参数方法");
    }

    public static void main(String[] args) {
        test(0, "入参1");
        test(0, "入参1", "入参2");
    }
}
