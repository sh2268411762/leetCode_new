package com.gdpph.o1kuaixue.demo.chapter07.section4.section11;

import java.util.Arrays;

/**
 * 数组排序
 * @author 零壹学堂
 */
public class SortArray {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[] { 10, 5, 12, 99, 50 };
        System.out.println("排序前：" + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("排序后：" + Arrays.toString(intArray));
        Character[] charArray = new Character[] { 'a', 'A', 'z', 'm' };
        System.out.println("排序前：" + Arrays.toString(charArray));
        Arrays.sort(charArray);
        System.out.println("排序后：" + Arrays.toString(charArray));
    }
}
