package com.gdpph.o1kuaixue.demo.chapter07.section4.section8;

import java.util.Arrays;

/**
 * 删除数组内重复元素
 * @author 零壹学堂
 */
public class DeleteDuplicateToArray {
    /**
     * 删除数组内重复元素
     * @param array 待删除重复元素的数组
     * @return 返回没有重复元素的数组
     */
    public static Object[] deleteDuplicateElement(Object[] array) {
        //记录删除重复后的数组长度和和临时数组的索引
        int length = 0;
        Object[] tempArray = new Object[array.length];//临时数组
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            //内层循环将原数组的元素逐个对比
            for (int j = i + 1; j < array.length; j++) {
                //如果发现有重复元素，改变标记状态并结束当次内层循环
                if (array[i] == array[j] || array[i].equals(array[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            //判断是否没有有重复元素
            if (!isDuplicate) {
                tempArray[length] = array[i];//将入参数组的元素赋给临时数组
                length++; // 记录数组不重复元素个数
            }
        }
        Object[] newArray = new Object[length];
        //使用arraycopy方法将去重的数组拷贝到新数组中，去除空的不必要的元素并返回
        System.arraycopy(tempArray, 0, newArray, 0, length);
        return newArray;
    }

    public static void main(String[] args) {
        Object[] array = new String[] { "零", "零", "壹", "壹", "学", "堂", "堂" };
        System.out.println("去重前数组内容为：" + Arrays.toString(array));
        array = deleteDuplicateElement(array);
        System.out.println("去重后数组内容为：" + Arrays.toString(array));
    }
}
