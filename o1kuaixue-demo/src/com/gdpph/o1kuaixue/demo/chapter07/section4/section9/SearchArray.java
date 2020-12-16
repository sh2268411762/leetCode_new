package com.gdpph.o1kuaixue.demo.chapter07.section4.section9;

/**
 * 数组查找
 * @author 零壹学堂
 */
public class SearchArray {
    /**
     * 在指定数组中查找指定元素
     * @param array 待查找数组
     * @param value 待查找元素
     * @return 返回查找到的索引，若找不到则返回-1
     */
    private static int searchElement(Object[] array, Object value) {
        int i = 0;
        for (; i < array.length; i++) {
            if (array[i] == value || array[i].equals(value)) {
                break;
            }
        }
        if (i == array.length) {
            return -1;
        }
        return i;
    }

    public static void main(String[] args) {
        Object array[] = new String[] { "零", "壹", "学", "堂" };
        System.out.println("查找'学'在array数组中索引为：" + (searchElement(array, "学") != -1 ? searchElement(array, "学") : "不存在该元素"));
        System.out.println("查找'01'在array数组中索引为：" + (searchElement(array, "01") != -1 ? searchElement(array, "01") : "不存在该元素"));
    }
}
