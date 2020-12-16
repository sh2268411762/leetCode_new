package com.gdpph.o1kuaixue.demo.chapter06.section2.section37;

/**
 * toCharArray()方法
 *
 * @author 零壹学堂
 */
public class StringToCharArray {
    public static void main(String[] args) {
        String str = "零壹学堂";
        char[] strChars = str.toCharArray();
        System.out.println("将字符串转换为字符数组：");
        for (char c : strChars) {
            System.out.println(c);
        }
    }
}
