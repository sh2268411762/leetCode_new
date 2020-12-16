package com.gdpph.o1kuaixue.demo.chapter06.section2.section21;

/**
 * 判断字符串前缀内容
 * @author 零壹学堂
 */
public class EndsWithString {
    public static void main(String[] args) {
        String Str = new String("www.01xuetang.com");
        System.out.print("是否以com后缀结尾 :");
        System.out.println(Str.endsWith("com"));
        System.out.print("是否以01xuetang后缀结尾 :");
        System.out.println(Str.startsWith("01xuetang"));
    }
}
