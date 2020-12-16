package com.gdpph.o1kuaixue.demo.chapter03.section4.section1;

/**
 * 自动转换
 * @author 零壹学堂
 */
public class AutoConvert {
    public static void main(String[] args) {
        byte byteNumber = 8;
        int intNumber = byteNumber;
        int intNumber1 = 12345;
        long longNumber = intNumber1;
        float floatNumber = longNumber;
        double doubleNumber = intNumber1;
        System.out.println("byte转为int：" + intNumber);
        System.out.println("int转为long：" + longNumber);
        System.out.println("long转为float：" + floatNumber);
        System.out.println("int转为double：" + doubleNumber);
    }
}
