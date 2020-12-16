package com.gdpph.o1kuaixue.demo.chapter05.section1.section2;

/**
 * 复合表达式if语句示例
 * @author 零壹学堂
 */
public class MultipleCondition {
    public static void main(String[] args) {
        int number = 101;
        if (number > 100 && number < 200) {
            System.out.println(number + "大于100并且小于200");
        }
        if (number % 2 > 0 || number % 3 > 0) {
            System.out.println(number + "不能被2整除或者不能被3整除");
        }
        if (number % 2 > 0 && (number - 100) > 0 && number % 3 > 0) {
            System.out.println("多条复合条件语句被判断执行");
        }
    }
}
