package com.gdpph.o1kuaixue.demo.chapter03.section6.section2;

/**
 * 比较运算符使用
 * @author 零壹学堂
 */
public class CompareOperation {
    public static void main(String[] args) {
        int a = 123;
        System.out.println("变量a的值为：" + a);
        System.out.println("使用不同比较运算符进行演示，如果成立返回true，不成立返回false");
        System.out.println("a<100的结果是：" + (a < 100));
        System.out.println("a>100的结果是：" + (a > 100));
        System.out.println("a<=200的结果是：" + (a <= 200));
        System.out.println("a>=200的结果是：" + (a >= 200));
        System.out.println("a==123的结果是：" + (a == 123));
        System.out.println("a!=123的结果是：" + (a != 123));
    }
}
