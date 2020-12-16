package com.gdpph.o1kuaixue.demo.chapter05.section1.section7;

/**
 * 三元操作符转换
 * @author 零壹学堂
 */
public class ConditionSample {
    public static void main(String[] args) {
        int number = 10;
        if (number > 100) {
            number -= 100;
        } else {
            number += 100;
        }
        // 三元操作符
        number = number > 100 ? (number - 100) : (number + 100);
    }
}
