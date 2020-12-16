package com.gdpph.o1kuaixue.demo.chapter03.section6.section5;

/**
 * 逻辑运算符使用
 * @author 零壹学堂
 */
public class LogicOpertion {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("isTrue && isFalse = " + (isTrue && isFalse));
        System.out.println("isTrue || isFalse = " + (isTrue || isFalse));
        System.out.println("!(isTrue && isFalse) = " + !(isTrue && isFalse));
    }
}
