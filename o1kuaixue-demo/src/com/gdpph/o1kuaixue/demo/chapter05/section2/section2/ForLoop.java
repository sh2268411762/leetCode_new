package com.gdpph.o1kuaixue.demo.chapter05.section2.section2;

/**
 * for循环使用break跳出循环
 * @author 零壹学堂
 */
public class ForLoop {
    public static void main(String[] args) {
        int i = 0;
        for (;;) {
            System.out.println("每次循环i都会加1，当前i等于：" + i);
            i++;
            if (i > 5) {
                break;
            }
        }
    }
}
