package com.gdpph.o1kuaixue.demo.chapter05.section1.section6;

/**
 * if…else语句多层嵌套
 * @author 零壹学堂
 */
public class MultipleCondition {
    public static void checkNumber(int number) {
        // 多层条件语句嵌套
        if (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number + "能够被2整除");
            } else {
                System.out.println(number + "不能被2整除");
                if (number % 3 == 0) {
                    System.out.println(number + "能被3整除");
                }
            }
        } else {
            System.out.println(number + "大于100");
        }
    }

    public static void main(String[] args) {
        checkNumber(4);
        checkNumber(99);
        checkNumber(101);
    }
}
