package com.gdpph.o1kuaixue.demo.chapter05.section1.section3;

/**
 * if语句后面大括号可以省略，但是可读性变差
 * @author 零壹学堂
 */
public class ConditionSample {
    public static void main(String[] args) {
        int number = 101;
        System.out.println(number + "大于100吗？");
        if (number > 100) {
            System.out.println(number + "加大括号条件语句");
        }
        if (number > 100)
            System.out.println(number + "不加大括号条件语句");
        if (number < 100)
            System.out.println("不加大括号条件语句，该条语句不会被执行");
        System.out.println("不加大括号条件语句只会对紧跟着的一条语句负责，该条语句仍然会被执行");
    }
}
