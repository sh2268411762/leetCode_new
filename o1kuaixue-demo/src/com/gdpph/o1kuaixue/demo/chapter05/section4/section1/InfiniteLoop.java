package com.gdpph.o1kuaixue.demo.chapter05.section4.section1;

/**
 * 循环条件设置不当导致无限循环
 * 程序退出需强行退出
 * @author 零壹学堂
 */
public class InfiniteLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 4) {
            System.out.println("无限循环，i=" + i);
            i++;
            if (i >= 4) {
                i = 2;
            }
        }
    }
}
