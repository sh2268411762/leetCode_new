package com.gdpph.o1kuaixue.demo.chapter08.section5.section2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 贪婪匹配与非贪婪匹配
 *
 * @author 零壹学堂
 */
public class PatternExample {
    public static void main(String[] args) {
        String str = "eating apple seeing paper watching movie";
        String regex = "(\b\\w+?)ing";
        Matcher matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
        regex = "(.+?)(?=ing)";
        matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
        regex = "(.+?)(?<=ing)";
        matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
        str = "unite one unethical ethics use untie ultimate";
        regex = "\b(?!un)\\w+\b";
        matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
        regex = "(?<![a-z])\\d{3,}";
        matcher = Pattern.compile(regex).matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
