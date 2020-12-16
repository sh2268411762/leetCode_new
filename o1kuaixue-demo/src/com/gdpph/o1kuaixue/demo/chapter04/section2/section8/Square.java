package com.gdpph.o1kuaixue.demo.chapter04.section2.section8;

/**
 * 方法返回值
 * @author 零壹学堂
 */
public class Square {
    private static int square(double number) {
        return (int) (number * number);
    }

    public static void main(String[] args) {
        System.out.println("边长为4的正方形面积是:" + square(4));
    }

}
