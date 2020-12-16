package com.gdpph.o1kuaixue.demo.chapter03.section4.section3;

/**
 * 强制转换
 * @author 零壹学堂
 */
public class HardConvert {
    public static void main(String[] args) {
        int intNumber = 8;
        byte byteNumber = (byte) intNumber;
        char charNumber= (char) 95.123;
        System.out.println("由int强制转换为byte：" + byteNumber);
        System.out.println("将95.123强制转换为字符char：" + charNumber);
    }
}
