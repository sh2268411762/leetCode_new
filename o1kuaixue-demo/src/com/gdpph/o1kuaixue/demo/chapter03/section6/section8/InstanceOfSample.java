package com.gdpph.o1kuaixue.demo.chapter03.section6.section8;

/**
 * instanceof运算符使用
 * @author 零壹学堂
 */
public class InstanceOfSample {
    public static void main(String[] args) {
        String name = "零壹学堂";
        Integer number = 1010;
        System.out.println("name变量的类型是String吗？" + (name instanceof String));
        System.out.println("name变量的类型是Object吗？" + (name instanceof Object));
        System.out.println("number变量的类型是Integer吗？" + (number instanceof Integer));
    }
}
