package com.gdpph.o1kuaixue.demo.chapter10.section1.section6;

/**
 * Double类中的常量
 * @author 零壹学堂
 */
public class DoubleConstant {
    public static void main(String[] args) {
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        int maxExponent = Double.MAX_EXPONENT;
        int minExponent = Double.MIN_EXPONENT;
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        double positiveInfinity = Double.POSITIVE_INFINITY;
        double naN = Double.NaN;
        int doubleSize = Double.SIZE;
        int doubleBytes = Double.BYTES;
        System.out.println("double类型最大正有限值为" + maxDouble);
        System.out.println("double类型最小正非零值为" + minDouble);
        System.out.println("double类型的二进制补码位数" + doubleSize);
        System.out.println("double类型的二进制补码字节数" + doubleBytes);
    }
}
