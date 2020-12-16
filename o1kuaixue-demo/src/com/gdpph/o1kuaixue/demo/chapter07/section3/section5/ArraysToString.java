package com.gdpph.o1kuaixue.demo.chapter07.section3.section5;

import java.util.Arrays;

/**
 * Arrays类静态方法toString使用
 * @author 零壹学堂
 */
public class ArraysToString {
    public static void main(String[] args) {
        char charArray[][] = new char[][] { { '零', '壹', '学', '堂' }, { 'a', 'b', 'c' } };
        // toString方法输出的是每维度数组的内存地址
        System.out.println("使用toString方法输出数组内容：" + Arrays.toString(charArray));
        // deepToString方法能够输出多维数组的每个维度的内容
        System.out.println("使用deepToString方法输出数组内容：" + Arrays.deepToString(charArray));
    }
}
