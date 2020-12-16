package com.gdpph.o1kuaixue.demo.chapter10.section1.section1;

/**
 * 装箱与拆箱
 * @author 零壹学堂
 */
public class BoxingAndUnBoxing {
    public static void main(String[] args) {
        Integer x = new Integer(10); // 手动装箱
        Integer y = 10; // 自动装箱
        int m = x.intValue(); // 手动拆箱
        int n = x; // 自动拆箱
    }
}
