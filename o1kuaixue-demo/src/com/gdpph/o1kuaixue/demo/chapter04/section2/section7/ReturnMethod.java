package com.gdpph.o1kuaixue.demo.chapter04.section2.section7;

/**
 * 返回return语句示例
 * @author 零壹学堂
 */
public class ReturnMethod {
    private static void voidMethod(int i) {
        if (i == 0) {
            System.out.println("入参为0会执行该条语句");
            return;
        }
        System.out.println("入参不为0时会执行到的语句");
    }

    public static void main(String[] args) {
        voidMethod(0);
        voidMethod(1);
    }
}
