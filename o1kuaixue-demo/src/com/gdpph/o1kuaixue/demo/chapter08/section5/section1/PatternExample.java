package com.gdpph.o1kuaixue.demo.chapter08.section5.section1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 贪婪匹配与非贪婪匹配
 *
 * @author 零壹学堂
 */
public class PatternExample {
    public static void main(String[] args) {
        // 示例1
        String str = "Are you ok?No, I am not ok.";
        String regex = ".+"; // 贪婪
        Matcher matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
        regex = ".+?"; // 非贪婪
        matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        } // 示例2
        str = "<this><is><an><example>";
        regex = "<.+>"; // 非贪婪
        matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
        regex = "<.+?>"; // 非贪婪
        matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
