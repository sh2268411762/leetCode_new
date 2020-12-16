package com.gdpph.o1kuaixue.demo.chapter03.section3.section5;

/**
 * long类型定义
 * @author 零壹学堂
 */
public class LongIntro {
    public static void main(String[] args) {
        long number = 12345L;
        long x = 123456789 * 987654321; //数字会默认为int进行相乘，数值溢出后类型强制转换为long
        long y = 123456789L * 987654321L; //数字被认为是long进行相乘
        System.out.println("long类型变量number为：" + number);
        System.out.println("long类型计算错误值：" + x);
        System.out.println("long类型计算正确值：" + y);
    }
}
