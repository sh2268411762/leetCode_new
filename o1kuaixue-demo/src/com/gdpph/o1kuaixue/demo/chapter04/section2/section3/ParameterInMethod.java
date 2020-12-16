package com.gdpph.o1kuaixue.demo.chapter04.section2.section3;

/**
 * 基础类型按值传递参数
 * @author 零壹学堂
 */
public class ParameterInMethod {
    private static void calculate(int number) {
        System.out.println("计算前，函数内部的number变量值为：" + number);
        number = number * 2 + 3;
        System.out.println("计算后，函数内部的number变量值为：" + number);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("调用函数前，外部的number变量值为：" + number);
        calculate(number);
        System.out.println("调用函数后，外部的number变量值为：" + number);
    }
}
