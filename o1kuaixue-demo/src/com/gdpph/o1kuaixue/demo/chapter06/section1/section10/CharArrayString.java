package com.gdpph.o1kuaixue.demo.chapter06.section1.section10;

/**
 * valueOf由字符数组创建字符串
 * @author 零壹学堂
 */
public class CharArrayString {
    public static void main(String[] args) {
        char[] charArray = { '零', '壹', '学', '堂' };
        String str = String.valueOf(charArray);
        System.out.println("由字符数组通过valueOf方法创建字符串为：" + str);
    }
}
