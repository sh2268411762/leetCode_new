package com.gdpph.o1kuaixue.demo.chapter05.section1.section12;

/**
 * 多条if语句简单判断，导致代码繁重
 * @author 零壹学堂
 */
public class MultipleIfCondition {
    public static void main(String[] args) {
        int number = 101;
        if (number == 2) {
            System.out.println(number + "等于2");
        }
        if (number == 20) {
            System.out.println(number + "等于20");
        }
        if (number == 50) {
            System.out.println(number + "等于50");
        }
        if (number == 101) {
            System.out.println(number + "等于101");
        }
    }
}
