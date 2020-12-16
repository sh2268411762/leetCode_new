package com.gdpph.o1kuaixue.demo.chapter05.section1.section5;

/**
 * if语句和else语句后面大括号可以省略，但是可读性变差
 * @author 零壹学堂
 */
public class ConditionSample {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(number + "大于100吗？");
        if (number > 100)
            System.out.println(number + "大于100");
        else
            System.out.println(number + "小于100");
    }
}
