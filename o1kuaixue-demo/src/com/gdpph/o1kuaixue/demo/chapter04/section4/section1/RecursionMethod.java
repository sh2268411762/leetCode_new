package com.gdpph.o1kuaixue.demo.chapter04.section4.section1;

/**
 * 无限循环程序
 * @author 零壹学堂
 */
public class RecursionMethod {
    private static void test() {
        System.out.println("方法仍在调用");
        test();
    }

    public static void main(String[] args) {
        test();
    }
}
