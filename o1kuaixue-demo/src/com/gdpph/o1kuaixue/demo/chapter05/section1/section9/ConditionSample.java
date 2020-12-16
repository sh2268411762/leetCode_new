package com.gdpph.o1kuaixue.demo.chapter05.section1.section9;

/**
 * else if语句和else语句一起使用示例
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
        } else {
            System.out.println(number + "大于或等于300");
        }
    }

    public static void main(String[] args) {
        checkNumber(150);
        checkNumber(299);
        checkNumber(300);
        checkNumber(301);
    }
}
