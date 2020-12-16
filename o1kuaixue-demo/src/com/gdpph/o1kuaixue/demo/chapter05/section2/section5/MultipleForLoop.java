package com.gdpph.o1kuaixue.demo.chapter05.section2.section5;

/**
 * for循环多层嵌套
 * @author 零壹学堂
 */
public class MultipleForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("这是内层循环，此时i=" + i + ", j=" + j);
            }
            System.out.println("这是外层循环，j不能被访问，此时i=" + i);
        }
    }
}
