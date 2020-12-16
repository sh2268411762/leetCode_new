package com.gdpph.o1kuaixue.demo.chapter06.section2.section11;

/**
 * 字符串替换
 * @author 零壹学堂
 */
public class ReplaceString {
    public static void main(String[] args) {
        String str = "零abc堂";
        str = str.replace("abc", "壹学");
        System.out.println("str字符串替换后结果为：" + str);
        String newStr = str.replace("cde", "找不到替换字符串");
        System.out.println("newStr找不到替换字符串，返回原来字符串：" + newStr);
        System.out.println("newStr和str引用内存地址是一个吗？" + newStr == str);
    }
}
