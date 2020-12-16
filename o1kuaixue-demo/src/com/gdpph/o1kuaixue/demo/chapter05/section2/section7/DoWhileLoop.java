package com.gdpph.o1kuaixue.demo.chapter05.section2.section7;

/**
 * do…while循环示例
 * @author 零壹学堂
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("dowhile循环，此时i=" + i);
            i++;
        } while (i < 4);
        do {
            System.out.println("i=" + i + ", 此时该语句仍会被执行一次");
        } while (i < 4);
    }
}
