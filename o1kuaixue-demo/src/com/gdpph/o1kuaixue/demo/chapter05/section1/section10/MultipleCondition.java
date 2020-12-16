package com.gdpph.o1kuaixue.demo.chapter05.section1.section10;

import java.util.Scanner;

/**
 * if…else语句多层嵌套
 * @author 零壹学堂
 */
public class MultipleCondition {
    // 判断入参数字
    public static void checkNumber(int number) {
        // 多层条件语句嵌套
        if (number <= 0) {
            System.out.println("欢迎与零壹学堂一起学习编程美妙的世界");
        } else if (number <= 2) {
            if (number == 2) {
                System.out.println("学习满两个月了，加油！");
            }
            System.out.println("基础语法与面向对象需要掌握");
        } else {
            if (number > 10) {
                System.out.println("学习超过10个月，欢迎参与零壹学堂问答社区一起分享编程知识");
            } else if (number > 5) {
                System.out.println("学习超过5个月，已经成功进阶为高级编程者");
            }
            System.out.println("学习尚未成功，同学仍需努力");
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入Java学习几个月？");
        number = scanner.nextInt();
        checkNumber(number);
    }
}
