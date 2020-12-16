package com.gdpph.o1kuaixue.demo.chapter07.section4.section14;

import java.util.Arrays;

/**
 * 数组内容比较
 * @author 零壹学堂
 */
public class CompareArray {
    public static void main(String[] args) {
        char[] charArray = new char[] { '零', '壹', '学', '堂' };
        System.out.println("原来数组为：" + Arrays.toString(charArray));
        char[] copyArray1 = Arrays.copyOf(charArray, 4);
        System.out.println("复制长度为4，复制后数组copyArray1为：" + Arrays.toString(copyArray1));
        char[] copyArray2 = Arrays.copyOf(charArray, 1);
        System.out.println("复制长度为1，复制后数组copyArray2为：" + Arrays.toString(copyArray2));
        char[] copyArray3 = Arrays.copyOf(charArray, 8);
        System.out.println("复制长度为8，复制后数组copyArray3为：" + Arrays.toString(copyArray3));
        System.out.println("复制后数组copyArray1与原来数组内容相同吗？" + (Arrays.equals(charArray, copyArray1)));
        System.out.println("复制后数组copyArray2与原来数组内容相同吗？" + (Arrays.equals(charArray, copyArray2)));
        System.out.println("复制后数组copyArray3与原来数组内容相同吗？" + (Arrays.equals(charArray, copyArray3)));
    }
}
