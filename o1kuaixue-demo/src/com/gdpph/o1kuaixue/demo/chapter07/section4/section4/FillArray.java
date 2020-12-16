package com.gdpph.o1kuaixue.demo.chapter07.section4.section4;

import java.util.Arrays;

/**
 * 数组批量添加元素
 * @author 零壹学堂
 */
public class FillArray {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        Arrays.fill(intArray, 10);
        System.out.println("intArray数组内被批量填充为：" + Arrays.toString(intArray));
    }
}
