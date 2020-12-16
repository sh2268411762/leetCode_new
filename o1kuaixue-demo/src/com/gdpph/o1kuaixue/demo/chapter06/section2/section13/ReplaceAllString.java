package com.gdpph.o1kuaixue.demo.chapter06.section2.section13;

/**
 * replaceAll方法替换字符串
 * @author 零壹学堂
 */
public class ReplaceAllString {
    public static void main(String[] args) {
        String str = "零壹abc学abc堂abc";
        str = str.replaceAll("a", ",");
        System.out.println("将str中字母a都替换成逗号：" + str);
        str = str.replaceAll("[a-zA-Z]+", ":");
        System.out.println("将str中多个紧挨的字母都替换成一个冒号：" + str);
    }
}
