package com.gdpph.o1kuaixue.demo.chapter05.section1.section8;

/**
 * else if语句示例
 * @author 零壹学堂
 */
public class ConditionSample {
    public static void checkNumber(int number) {
        System.out.println(number + "的值在哪个范围内？");
        if (number < 100) {
            System.out.println(number + "小于100");
        } else if (number < 200) {
            System.out.println(number + "小于200");
        } else if (number < 300) {
            System.out.println(number + "小于300");
        }
    }

    public static void main(String[] args) {
        checkNumber(90);
        checkNumber(199);
        checkNumber(250);
    }
}
