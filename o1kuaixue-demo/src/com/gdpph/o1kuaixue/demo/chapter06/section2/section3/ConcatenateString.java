package com.gdpph.o1kuaixue.demo.chapter06.section2.section3;

/**
 * 使用“+”连接字符串与其他基础类型数值，会被转换为字符串
 * @author 零壹学堂
 */
public class ConcatenateString {
    public static void main(String[] args) {
        String str = "零壹学堂" + 101; // 整型101被转换为String
        System.out.println("连接字符串与整型" + str);
        str = "零壹学堂"+ 10.01;
        System.out.println("连接字符串与浮点型" + str);
        str = "零壹学堂" + true;
        System.out.println("连接字符串与布尔型" + str);
    }
}
