package com.gdpph.o1kuaixue.demo.chapter04.section3.section3;

/**
 * 存在两个可变参数入参的同名方法，编译报错
 * @author 零壹学堂
 */
public class VariableMethod {
    public static void test(String... args) {
        System.out.println("这是test方法");
    }

    public static void test(String arg1, String... args) {
        System.out.println("这是test方法");
    }

    public static void main(String[] args) {
//        test("入参1", "入参2");
    }
}
