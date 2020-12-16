package com.gdpph.o1kuaixue.demo.chapter10.section1.section7;

/**
 * Double构造方法
 * @author 零壹学堂
 */
public class DoubleConstructor {
    public static void main(String[] args) {
        Double d1 = new Double(10.01);
        Double d2 = new Double("10.01");
        System.out.println("以double类型为入参构造Double对象:" + d1);
        System.out.println("以String为入参构造Double对象:" + d2);
    }
}
