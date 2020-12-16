package com.gdpph.o1kuaixue.demo.chapter06.section2.section1;

/**
 * 使用“+”运算符连接字符串
 * @author 零壹学堂
 */
public class ConcatenateString {
    public static void main(String[] args) {
        String str = "零壹" + "学堂";
        System.out.println("使用+号连接字符串：" + str);
        String segment = str + "学习编程知识";
        System.out.println("变量连接字符串常量" + segment);
        System.out.println(str + ", 一起在" + segment); // 连接变量和字符串
    }
}
