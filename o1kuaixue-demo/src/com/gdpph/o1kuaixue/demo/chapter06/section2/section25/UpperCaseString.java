package com.gdpph.o1kuaixue.demo.chapter06.section2.section25;

/**
 * 结合substring将首字母大写
 * @author 零壹学堂
 */
public class UpperCaseString {
    public static void main(String[] args) {
        String str = "java工程师";
        str = str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
        System.out.println("将str首字母大写，结果为：" + str);
    }
}
