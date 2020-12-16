package com.gdpph.o1kuaixue.demo.chapter06.section2.section6;

/**
 * 获取字符串长度
 * @author 零壹学堂
 */
public class StringLength {
    public static void main(String[] args) {
        String str = "零壹学堂";
        int length = str.length();
        System.out.println("字符串对象str长度为：" + str.length());
        str = " ";
        System.out.println("一个空格的字符串对象长度为：" + str.length());
    }
}
