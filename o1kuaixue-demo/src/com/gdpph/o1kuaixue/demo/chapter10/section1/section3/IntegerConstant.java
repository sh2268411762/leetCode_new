package com.gdpph.o1kuaixue.demo.chapter10.section1.section3;

/**
 * Integer类中的常量
 * @author 零壹学堂
 */
public class IntegerConstant {
    public static void main(String[] args) {
        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;
        int intSize = Integer.SIZE;
        int intBytes = Integer.BYTES;
        System.out.println("int类型最大值为" + maxIntValue); // int类型最大值为2147483647
        System.out.println("int类型最小值为" + minIntValue); // int类型最小值为-2147483648
        System.out.println("int类型的二进制补码位数" + intSize); // int类型二进制补码位数为32
        System.out.println("int类型的二进制补码字节数" + intBytes); // int类型二进制补码字节数为4，1字节=8位（1Byte=8bit）
    }
}
