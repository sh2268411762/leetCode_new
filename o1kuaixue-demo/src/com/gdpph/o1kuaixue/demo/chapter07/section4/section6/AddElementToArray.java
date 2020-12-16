package com.gdpph.o1kuaixue.demo.chapter07.section4.section6;

import java.util.Arrays;

/**
 * 数组添加元素
 * @author 零壹学堂
 */
public class AddElementToArray {
    /**
     * 在数组指定索引位置添加一个元素
     * @param array 待添加元素的数组
     * @param index 索引
     * @param value 待添加的元素
     * @return 添加后的数组
     */
    private static String[] insertElement(String[] array, int index, String value) {
        String[] insertArray = new String[array.length + 1];
        for (int i = 0; i < array.length + 1; i++) {
            if (i < index) {
                insertArray[i] = array[i];
            }
            if (i == index) {
                insertArray[i] = value;
            }
            if (i > index) {
                insertArray[i] = array[i - 1];
            }
        }
        return insertArray;
    }

    public static void main(String[] args) {
        String[] array = new String[] { "零", "壹", "堂" };
        System.out.println("添加前数组内容：" + Arrays.toString(array));
        array = insertElement(array, 2, "学");
        System.out.println("添加后数组内容：" + Arrays.toString(array));
    }
}
