package com.gdpph.o1kuaixue.demo.chapter06.section2.section24;

/**
 * 转为大写字符
 * @author 零壹学堂
 */
public class UpperCaseString {
    public static void main(String[] args) {
        String str = "aBc零壹学堂";
        str = str.toUpperCase();
        System.out.println("将str中小写字母转为大写字母，结果为：" + str);
    }
}
