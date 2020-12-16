package com.gdpph.o1kuaixue.demo.chapter07.section3.section4;

import java.util.Arrays;

/**
 * Arrays类静态方法toString使用
 * @author 零壹学堂
 */
public class ArraysToString {
    public static void main(String[] args) {
        char charArray[] = new char[] { '零', '壹', '学', '堂' };
        System.out.println("使用toString方法输出数组内容：" + Arrays.toString(charArray));
    }
}
