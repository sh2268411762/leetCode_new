package com.gdpph.o1kuaixue.demo.chapter06.section1.section9;

/**
 * 字符数组初始化字符串String
 * @author 零壹学堂
 */
public class CharArrayString {
    public static void main(String[] args) {
        char[] charArray = { '零', '壹', '学', '堂' };
        String str = new String(charArray, 2, 1);
        System.out.println("由字符数组索引2开始，提取1个元素初始化字符串为：" + str);
    }
}
