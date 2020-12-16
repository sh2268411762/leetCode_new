package com.gdpph.o1kuaixue.demo.chapter06.section2.section14;

/**
 * replaceAll方法替换字符串
 * @author 零壹学堂
 */
public class ReplaceAllString {
    public static void main(String[] args) {
        String str = "零壹abc学abc堂abc";
        str = str.replaceAll("[a-zA-Z]+", "");
        System.out.println("将str中多个紧挨的字母都删除：" + str);
        String newStr = "9123零壹asdf学堂";
        newStr = newStr.replaceAll("[\\da-zA-Z]+", "");
        System.out.println("将newStr中数字和字母都删除：" + newStr);
    }
}
