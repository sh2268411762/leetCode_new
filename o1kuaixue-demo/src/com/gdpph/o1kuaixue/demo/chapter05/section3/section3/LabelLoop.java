package com.gdpph.o1kuaixue.demo.chapter05.section3.section3;

/**
 * 多层循环使用标签
 * @author 零壹学堂
 */
public class LabelLoop {
    public static void main(String[] args) {
        outer_loop:
        for (int i = 0; i < 4; i++) {
            System.out.println("外层循环，i=" + i);
            inner_loop:
            for (int j = 0; j < i; j++) {
                if (i + j > 2) {
                    System.out.println(i + "+" + j + ">2, 内层循环执行continue到外层标签的语句");
                    continue outer_loop;
                }
                System.out.println("内层循环，i=" + i + ", j=" + j);
            }
            System.out.println("被continue中断过循环，该条语句不是每次都会被执行");
        }
    }
}
