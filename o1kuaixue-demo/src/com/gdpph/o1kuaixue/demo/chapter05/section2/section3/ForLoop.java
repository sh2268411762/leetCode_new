package com.gdpph.o1kuaixue.demo.chapter05.section2.section3;

/**
 * for循环使用逗号运算符
 * @author 零壹学堂
 */
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 5; i++, j++) {
            System.out.println("每次循环i都会加1，当前i等于：" + i);
            System.out.println("每次循环j都会加1，当前j等于：" + j);
        }
    }
}
