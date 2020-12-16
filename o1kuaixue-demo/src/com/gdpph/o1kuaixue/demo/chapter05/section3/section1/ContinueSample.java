package com.gdpph.o1kuaixue.demo.chapter05.section3.section1;

/**
 * continue中断语句示例
 * @author 零壹学堂
 */
public class ContinueSample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("执行continue语句，跳出i=3当前循环");
                continue;
            }
            System.out.println("此时i=" + i);
        }
    }
}
