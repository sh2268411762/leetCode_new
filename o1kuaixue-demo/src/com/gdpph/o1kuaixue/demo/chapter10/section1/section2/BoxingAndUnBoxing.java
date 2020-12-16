package com.gdpph.o1kuaixue.demo.chapter10.section1.section2;

/**
 * 自动装箱中的一个陷阱
 * @author 零壹学堂
 */
public class BoxingAndUnBoxing {
    public static void main(String[] args) {
        /**
         * Java会缓存-127~128的数值，在范围内会复用这个对象（内存分配的是同一个地址）
         */
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1 == i2); // true, i1和i2都指向内存中同一个地址，所以为同一个对象
        System.out.println(i1.equals(i2)); // true
        /**
         * Java会缓存-127~128的数值，超过了后Java会重新建一个对象
         */
        i1 = 200;
        i2 = 200;
        System.out.println(i1 == i2); // false
        System.out.println(i1.equals(i2)); // true
    }
}
