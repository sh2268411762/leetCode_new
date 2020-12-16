package com.gdpph.o1kuaixue.demo.chapter05.section1.section11;

import java.util.Scanner;

/**
 * if…else语句多层嵌套不好的示例，导致逻辑混乱
 * @author 零壹学堂
 */
public class MultipleCondition {
    // 判断入参数字
    public static void checkNumber(int number) {
        // 多层条件语句嵌套
        if (number <= 0) {
            System.out.println("欢迎与零壹学堂一起学习编程美妙的世界");
        } else if (number <= 2) {
            if (number > 2) {
                System.out.println("混乱");
            } else if(number <2) {
                if(number % 2 == 0) {
                    if(number >0){
                        System.out.println("这种条件分支逻辑很混乱，很难梳理如何执行代码");
                    }
                }
            }
        } else {
            System.out.println("程序被执行");
        }
    }

    public static void main(String[] args) {
        checkNumber(2);
    }
}
