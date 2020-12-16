package com.gdpph.o1kuaixue.demo.chapter06.section3.section8;

/**
 * 反转方法
 * @author 零壹学堂
 */
public class ReverseStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("零壹学堂");
        stringBuilder.append("avaJ");
        System.out.println("反转前：" + stringBuilder);
        stringBuilder.reverse(); // 反转对象中字符序列
        System.out.println("反转后：" + stringBuilder);
    }
}
