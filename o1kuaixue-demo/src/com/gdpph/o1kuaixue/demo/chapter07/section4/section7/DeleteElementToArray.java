package com.gdpph.o1kuaixue.demo.chapter07.section4.section7;

import java.util.Arrays;

/**
 * 删除数组中指定元素
 * @author 零壹学堂
 */
public class DeleteElementToArray {
    /**
     * 删除数组中指定索引位置的元素
     * @param array 指定的数组
     * @param index 索引位置
     * @return 删除元素后的数组
     */
    private static String[] deleteElement(String[] array, int index) {
        String[] deleteArray = new String[array.length - 1];
        for (int i = 0; i < deleteArray.length; i++) {
            if (i < index) {
                deleteArray[i] = array[i];
            } else {
                deleteArray[i] = array[i + 1];
            }
        }
        return deleteArray;
    }

    public static void main(String[] args) {
        String[] array = new String[] { "零", "壹", "01", "学", "堂" };
        System.out.println("删除前数组内容：" + Arrays.toString(array));
        array = deleteElement(array, 2);
        System.out.println("删除后数组内容：" + Arrays.toString(array));
    }
}
