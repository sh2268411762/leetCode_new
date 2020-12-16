package com.gdpph.o1kuaixue.demo.chapter06.section2.section12;

/**
 * 字符串替换
 * @author 零壹学堂
 */
public class ReplaceString {
    public static void main(String[] args) {
        String str = "零abc堂";
        str = str.replace("Abc", "壹学");
        System.out.println("str字符串替换后结果为：" + str); // 大小写是敏感的，无法找到要替换的字符串
        str = str.replace("[a-zA-Z]+", ",");
        System.out.println("str字符串替换后结果为：" + str); // 不支持正则表达式
    }
}
