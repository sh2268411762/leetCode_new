package com.gdpph.o1kuaixue.demo.chapter06.section2.section4;

/**
 * 使用“+”连接字符串与其他基础类型数值，会被转换为字符串
 * 括号优先级高的运算符会先被计算
 * @author 零壹学堂
 */
public class ConcatenateString {
    public static void main(String[] args) {
        String str = "零壹学堂" + 1 + 2; // 整型1和2依次被转换为String进行连接
        System.out.println("连接字符串与整型结果为：" + str);
        str = "零壹学堂" + (1 + 2); // 由于括号优先级较高，会先计算1+2数值运算，后将结果转换为字符串进行连接
        System.out.println("带括号运算字符串连接结果为：" + str);
    }
}
