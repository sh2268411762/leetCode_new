package com.gdpph.o1kuaixue.demo.chapter06.section1.section11;

/**
 * valueOf由字符数组内部分内容创建字符串
 * @author 零壹学堂
 */
public class CharArrayString {
    public static void main(String[] args) {
        char[] charArray = { '零', '壹', '学', '堂' };
        String str = String.valueOf(charArray, 2, 2);
        System.out.println("由字符数组通过valueOf方法，从索引2开始取两个元素创建字符串为：" + str);
    }
}
