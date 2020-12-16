package com.gdpph.o1kuaixue.demo.chapter04.section4.section2;

/**
 * 无限循环程序
 * @author 零壹学堂
 */
public class RecursionMethod {
    private static void Jim() {
        System.out.println("Hello! I am Jim.");
        Jack();
    }

    private static void Jack() {
        System.out.println("Hello! I am Jack.");
        Jim();
    }

    public static void main(String[] args) {
        Jim();
    }
}
