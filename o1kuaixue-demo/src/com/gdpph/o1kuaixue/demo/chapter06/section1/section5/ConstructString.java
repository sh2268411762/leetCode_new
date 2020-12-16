package com.gdpph.o1kuaixue.demo.chapter06.section1.section5;

/**
 * 构造方法初始化字符串
 * @author 零壹学堂
 */
public class ConstructString {
    public static void main(String[] args) {
        String str = new String(); // 创建了一个空的字符串对象
        System.out.println("创建一个空的字符串对象：" + str);
        str = new String("零壹学堂");
        System.out.println("使用构造方法创建字符串对象：" + str);
        str = String.valueOf(1);
        System.out.println("将整型数值1转换为字符串：" + str);
        str = String.valueOf(Boolean.TRUE);
        System.out.println("将布尔数值true转换为字符串：" + str);
    }
}
