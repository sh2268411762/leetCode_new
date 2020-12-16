package com.gdpph.o1kuaixue.demo.chapter06.section2.section20;

/**
 * 判断字符串前缀内容
 * @author 零壹学堂
 */
public class StartWithString {
    public static void main(String[] args) {
        String Str = new String("www.01xuetang.com");
        System.out.print("是否以www前缀开始 :");
        System.out.println(Str.startsWith("www"));
        System.out.print("是否以01xuetang前缀开始 :");
        System.out.println(Str.startsWith("01xuetang"));
        System.out.print("从索引4处开始，是否以01xuetang为开始 :");
        System.out.println(Str.startsWith("01xuetang", 4));
    }
}
