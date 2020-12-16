package com.gdpph.o1kuaixue.demo.chapter05.section2.section1;

/**
 * for循环示例
 * @author 零壹学堂
 */
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("每次循环i都会加1，当前i等于：" + i);
        }
        for (char c = 0; c < 5; c++) {
            System.out.print("每次循环c都会加1，当前字符c等于：" + c);
            System.out.println("，转换为int型数值为：" + (int) c);
        }
    }
}
