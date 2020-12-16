package com.gdpph.o1kuaixue.demo.chapter05.section3.section2;

/**
 * 多层嵌套循环中continue语句只会作用在当前循环中
 * @author 零壹学堂
 */
public class ContinueInLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 1) {
                    System.out.println("当前j=" + j + "，执行continue语句");
                    continue;
                }
                System.out.println("内层循环j=" + j);
            }
            System.out.println("外层循环，内部循环的continue语句不会影响外层循环：i=" + i);
        }
    }
}
