package com.gdpph.o1kuaixue.demo.chapter07.section4.section13;

import java.util.Arrays;

/**
 * 数组复制
 * @author 零壹学堂
 */
public class CopyArray {
    public static void main(String[] args) {
        char[] charArray = new char[] { '零', '壹', '学', '堂' };
        System.out.println("原来数组为：" + Arrays.toString(charArray));
        char[] copyArray1 = Arrays.copyOf(charArray, 4);
        System.out.println("复制长度为4，复制后数组为：" + Arrays.toString(copyArray1));
        char[] copyArray2 = Arrays.copyOf(charArray, 1);
        System.out.println("复制长度为1，复制后数组为：" + Arrays.toString(copyArray2));
        char[] copyArray3 = Arrays.copyOf(charArray, 8);
        System.out.println("复制长度为8，复制后数组为：" + Arrays.toString(copyArray3));
        System.out.println("复制后数组与原来数组引用地址相同吗？" + (copyArray1 == charArray));
    }
}
