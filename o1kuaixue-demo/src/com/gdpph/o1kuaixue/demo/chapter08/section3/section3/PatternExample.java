package com.gdpph.o1kuaixue.demo.chapter08.section3.section3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern类示例 Matcher类分组
 *
 * @author 零壹学堂
 */
public class PatternExample {
    public static void main(String[] args) {
        String str = "零壹学堂www.01xuetang.com";
        String regex = "[0-1A-Za-z](.*)(\\.)"; // 满足多个字符后面只有1个'.'的情况
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int groupCount = matcher.groupCount();
        System.out.println("匹配到组合数量为：" + groupCount);
        if (matcher.find()) {
            for (int i = 0; i <= groupCount; i++) {
                System.out.println("匹配到字符组合：" + matcher.group(i));
            }
        } else {
            System.out.println("未找到匹配正则的字符组合");
        }
    }
}
