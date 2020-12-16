package com.gdpph.o1kuaixue.demo.chapter08.section3.section4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * PatternSyntaxException示例
 *
 * @author 零壹学堂
 */
public class PatternExample {
    public static void main(String[] args) {
        String str = "零壹学堂www.01xuetang.com";
        String regex = "[0-1A-Za-Z](.*)"; // 字母Z应该在a前面，a-Z非法错误
        Pattern pattern = Pattern.compile(regex); // 抛出异常
    }
}
