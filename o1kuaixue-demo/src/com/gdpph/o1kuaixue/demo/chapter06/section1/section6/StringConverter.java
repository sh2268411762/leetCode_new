package com.gdpph.o1kuaixue.demo.chapter06.section1.section6;

/**
 * 基础类型String转换
 * @author 零壹学堂
 */
public class StringConverter {
    public static void main(String[] args) {
        String str = String.valueOf('c');
        System.out.println("字符转换为字符串：" + str);
        str = String.valueOf(22.12);
        System.out.println("double类型转换为字符串：" + str);
        str = String.valueOf(str);
        System.out.println("将对象转换为字符串" + str);
    }
}
