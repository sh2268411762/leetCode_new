package com.gdpph.o1kuaixue.demo.chapter03.section6.section4;

/**
 * 递增和递减运算符
 * @author 零壹学堂
 */
public class SelfOperation {
    public static void main(String[] args) {
        // 递增运算符
        int a = 5;
        System.out.println("a的值为：" + a);
        int a1 = ++a;
        System.out.println("前置递增运算后，a的值是" + a + ",a1的值是" + a1);
        int a2 = a++;
        System.out.println("前置递增运算后，a的值是" + a + ",a2的值是" + a2);
        // 递减运算符
        int b = 5;
        System.out.println("b的值为：" + b);
        int b1 = --b;
        System.out.println("前置递增运算后，b的值是" + b + ",b1的值是" + b1);
        int b2 = b--;
        System.out.println("前置递增运算后，b的值是" + b + ",b2的值是" + b2);

    }
}
