package com.gdpph.o1kuaixue.demo.chapter06.section1.section7;

/**
 * 基础类型强制转换为String会报错
 * @author 零壹学堂
 */
public class StringConverter {
    public static void main(String[] args) {
        char c = 'c';
 //       String str = (String) c; // 编译报错
//        System.out.println("字符强制转换为字符串：" + str);
        int i = 101;
 //       str = (String) i; // 编译报错
//        System.out.println("int强制转换为字符串：" + str);
    }
}
