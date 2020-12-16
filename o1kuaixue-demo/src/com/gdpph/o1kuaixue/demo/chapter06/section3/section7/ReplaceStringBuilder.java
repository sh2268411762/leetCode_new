package com.gdpph.o1kuaixue.demo.chapter06.section3.section7;

/**
 * StringBuilder中replace方法替换字符串
 * @author 零壹学堂
 */
public class ReplaceStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("零壹学堂");
        System.out.println("替换前为：" + stringBuilder);
        stringBuilder.replace(0, 4, "www.01xuetang.com");
        System.out.println("替换后为：" + stringBuilder);
    }
}
