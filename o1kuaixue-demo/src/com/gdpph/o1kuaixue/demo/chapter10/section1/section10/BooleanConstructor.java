package com.gdpph.o1kuaixue.demo.chapter10.section1.section10;

/**
 * Boolean构造方法
 * @author 零壹学堂
 */
public class BooleanConstructor {
    public static void main(String[] args) {
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("false");
        System.out.println("以boolean类型为入参构造Boolean对象:" + b1);
        System.out.println("以String为入参构造Boolean对象:" + b2);
    }
}
