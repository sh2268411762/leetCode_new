package com.gdpph.o1kuaixue.demo.chapter06.section2.section30;

/**
 * 字符串转换符
 *
 * @author 零壹学堂
 */
public class FormatString {
    public static void main(String[] args) {
        int i = 1010;
        System.out.println(String.format("整数前面加空格：% 4d", i));
        System.out.println(String.format("整数前面补0：%04d", i));
    }
}
