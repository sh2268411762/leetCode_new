package com.gdpph.o1kuaixue.demo.chapter10.section2.section6;

/**
 * random()方法生成随机字符
 *
 * @author 零壹学堂
 */
public class RandomChar {
    public static void main(String[] args) {
        System.out.println("生成a到z之间随机字符：" + (char) ('a' + Math.random() * ('z' - 'a' + 1)));
        System.out.println("生成a到z之间随机字符：" + (char) ('a' + Math.random() * ('z' - 'a' + 1)));
        System.out.println("生成a到z之间随机字符：" + (char) ('a' + Math.random() * ('z' - 'a' + 1)));
    }
}
