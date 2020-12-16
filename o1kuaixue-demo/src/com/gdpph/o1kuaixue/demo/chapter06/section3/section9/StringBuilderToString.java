package com.gdpph.o1kuaixue.demo.chapter06.section3.section9;

/**
 * toString方法
 * @author 零壹学堂
 */
public class StringBuilderToString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("零壹学堂");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.toString());
        System.out.println(String.valueOf(stringBuilder));
    }
}
