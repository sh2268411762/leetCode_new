package com.gdpph.o1kuaixue.demo.chapter03.section3.section14;

/**
 * 转义符使用
 * @author 零壹学堂
 */
public class EscapeChar {
    public static void main(String[] args) {
        char character1 = '\\';
        char character2 = '\t';
        char character3 = '\u2501';
        char character4 = '\'';
        System.out.println("转义符：{" + character1 + "}");
        System.out.println("转义符：{" + character2 + "}");
        System.out.println("转义符：{" + character3 + "}");
        System.out.println("转义符：{" + character4 + "}");
    }
}
