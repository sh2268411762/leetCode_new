package com.gdpph.o1kuaixue.demo.chapter08.section3.section2;

import java.util.regex.Pattern;

/**
 * Pattern类示例
 *
 * @author 零壹学堂
 */
public class PatternExample {
    public static void main(String[] args) {
        String str = "零壹学堂www.01xuetang.com";
        String regex = ".*01xuetang.*";
        System.out.println("字符串中是否包括'01xuetang'?" + Pattern.matches(regex, str));
    }
}
