package com.gdpph.o1kuaixue.demo.chapter05.section3.section4;

/**
 * break中断循环
 * @author 零壹学堂
 */
public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i > 3) {
                System.out.println("i=" + i + "时，会直接中断循环跳出");
                break;
            }
            System.out.println("当前循环i=" + i);
        }
    }
}
