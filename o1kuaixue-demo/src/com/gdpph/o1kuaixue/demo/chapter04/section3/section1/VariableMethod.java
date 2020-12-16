package com.gdpph.o1kuaixue.demo.chapter04.section3.section1;

/**
 * 可变入参方法定义和使用
 * @author 零壹学堂
 */
public class VariableMethod {
    public static void test(String... args) {
        System.out.println("这是可变入参方法");
        for (String arg : args) {
            System.out.println("入参为：" + arg);
        }
    }

    public static void main(String[] args) {
        test();
        test("A");
        test("A", "B", "C");
    }
}
