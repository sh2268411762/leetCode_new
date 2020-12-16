package com.gdpph.o1kuaixue.demo.chapter10.section1.section4;

/**
 * Integer构造方法
 * @author 零壹学堂
 */
public class IntegerConstructor {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer("10");
        System.out.println("以int类型为入参构造Integer对象:" + i1);
        System.out.println("以String为入参构造Integer对象:" + i2);
    }
}
