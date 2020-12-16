package com.gdpph.o1kuaixue.demo.chapter06.section2.section18;

/**
 * 字符串分割
 * @author 零壹学堂
 */
public class SplitString {
    public static void main(String[] args) {
        String str = "计算机,编程,工程师,";
        String[] strArray = str.split(",");
        for (String element : strArray) {
            System.out.println("分割后字符串数组中内容依次为：" + element);
        }
    }
}
