package com.gdpph.o1kuaixue.demo.chapter03.section4.section4;

/**
 * 强制转换
 * @author 零壹学堂
 */
public class HardConvert {
    public static void main(String[] args) {
        int intNumber = 8888;
        byte byteNumber = (byte) intNumber; // 超出byte最大值127
        char charNumber= (char) 987654321.123; // 超出char最大值65536
        System.out.println("由int强制转换为byte：" + byteNumber);
        System.out.println("将987654321.123强制转换为字符char：" + charNumber);
    }
}
