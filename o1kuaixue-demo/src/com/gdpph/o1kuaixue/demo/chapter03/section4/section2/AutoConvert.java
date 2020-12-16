package com.gdpph.o1kuaixue.demo.chapter03.section4.section2;

/**
 * 自动转换：由高位数数据类型向低位数数据类型转换
 * 编译报错
 * @author 零壹学堂
 */
public class AutoConvert {
    public static void main(String[] args) {
        long longNumber = 12345;
//        int intNumber = longNumber; // 编译报错
        double doubleNumber = 12.345;
//        byte byteNumber = doubleNumber; // 编译报错
    }
}
