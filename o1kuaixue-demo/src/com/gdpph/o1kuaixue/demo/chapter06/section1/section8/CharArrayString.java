package com.gdpph.o1kuaixue.demo.chapter06.section1.section8;

/**
 * 字符数组初始化字符串String
 * @author 零壹学堂
 */
public class CharArrayString {
    public static void main(String[] args) {
        char[] charArray = { '零', '壹', '学', '堂' };
        String str = new String(charArray);
        System.out.println("由字符数组初始化字符串为：" + str);
    }
}
