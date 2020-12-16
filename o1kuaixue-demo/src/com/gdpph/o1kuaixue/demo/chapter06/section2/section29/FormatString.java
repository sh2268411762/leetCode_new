package com.gdpph.o1kuaixue.demo.chapter06.section2.section29;

/**
 * 格式化字符串
 *
 * @author 零壹学堂
 */
public class FormatString {
    public static void main(String[] args) {
        int i = 10;
        String str = "零壹学堂";
        System.out.println(String.format("整型转换：%d", i));
        System.out.println(String.format("字符串转换：%s+%d", str, i));
    }
}
