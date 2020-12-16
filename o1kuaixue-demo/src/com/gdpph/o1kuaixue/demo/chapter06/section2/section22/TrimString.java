package com.gdpph.o1kuaixue.demo.chapter06.section2.section22;

/**
 * 字符串首尾去空格
 * @author 零壹学堂
 */
public class TrimString {
    public static void main(String[] args) {
        String str = "   零 壹 学 堂     ";
        str = str.trim();
        System.out.println("str首尾去除空格结果为：" + str);
    }
}
