package com.gdpph.o1kuaixue.demo.chapter07.section4.section12;

import java.util.Arrays;

/**
 * 冒泡算法
 * @author 零壹学堂
 */
public class BubbleSort {

    /**
     * 冒泡算法排序，升序排序，嵌套循环
     * @param array 待排序数组
     */
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {//外层循环控制排序次数
            for (int j = 0; j < array.length - 1 - i; j++) {//内层循环控制每一次排序次数
                if (array[j] > array[j + 1]) {
                    // 交换元素位置，使得较大的元素移动到较小元素后面
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 6, 3, 8, 2, 9, 1 };
        System.out.println("排序前数组为：" + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("排序后数组为：" + Arrays.toString(array));
    }
}
