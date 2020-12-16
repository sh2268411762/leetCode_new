package com.gdpph.o1kuaixue.demo.chapter07.section4.section5;

import java.util.Arrays;

/**
 * 数组批量添加指定索引范围的数组元素
 * @author 零壹学堂
 */
public class FillArray {
    public static void main(String[] args) {
        int[] intArray = new int[4];
        Arrays.fill(intArray, 1, 3, 10);
        System.out.println("intArray数组索引0到3内(不包括3)被批量填充为：" + Arrays.toString(intArray));
    }
}
