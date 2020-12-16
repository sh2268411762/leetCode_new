package com.gdpph.o1kuaixue.demo.chapter05.section3.section7;

/**
 * return中断循环语句
 * @author 零壹学堂
 */
public class ReturnInLoop {
    public static void printMethod() {
        for (int i = 0; i < 4; i++) {
            if (i == 3) {
                System.out.println("执行return语句直接返回，中断当前循环");
                return;
            }
            System.out.println("循环i=" + i);
        }
    }

    public static void main(String[] args) {
        printMethod();
    }

}
