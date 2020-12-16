package com.gdpph.o1kuaixue.demo.chapter10.section1.section15;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * BigInteger和BigDecimal示例
 *
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1010");
        System.out.println("创建BigInteger对象：" + bigInteger.toString());
        bigInteger.add(new BigInteger("101"));
        System.out.println("BigInteger对象加上101结果：" + bigInteger.toString());
        bigInteger = bigInteger.add(new BigInteger("101"));
        System.out.println("BigInteger对象加上101结果：" + bigInteger.toString());
        BigDecimal bigDecimal = new BigDecimal("3.14");
        System.out.println("创建BigDecimal对象：" + bigDecimal.toString());
        System.out.println("BigDecimal对象精度为：" + bigDecimal.precision());
    }
}
