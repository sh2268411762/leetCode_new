package com.gdpph.o1kuaixue.demo.chapter03.section6.section7;

/**
 * 按位操作符
 * @author 零壹学堂
 */
public class BitOperation {
    public static void main(String[] args) {
        int a = 9; //二进制1001
        int b = 13; //二进制1101
        System.out.println("按位操作a&b结果为：" + (a & b));
        System.out.println("按位操作a|b结果为：" + (a | b));
        System.out.println("按位操作a^b结果为：" + (a ^ b));
        System.out.println("按位操作~a结果为：" + (~a));
    }
}
