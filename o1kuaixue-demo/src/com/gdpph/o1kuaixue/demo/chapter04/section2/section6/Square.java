package com.gdpph.o1kuaixue.demo.chapter04.section2.section6;

/**
 * 方法返回值
 * @author 零壹学堂
 */
public class Square {
    private static double square(double number) {
        return number * number;
    }

    public static void main(String[] args) {
        System.out.println("边长为4的正方形面积是:" + square(4));
    }

}
