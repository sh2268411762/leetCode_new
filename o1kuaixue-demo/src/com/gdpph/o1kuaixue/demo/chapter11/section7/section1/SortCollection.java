package com.gdpph.o1kuaixue.demo.chapter11.section7.section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collection类sort()方法
 *
 * @author 零壹学堂
 */
public class SortCollection {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        double array[] = { 3, 101, 345, 987, 1 };
        System.out.println("排序前数字集合顺序为：");
        for (int i = 0; i < array.length; i++) {
            list.add(new Double(array[i]));
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println("排序后数字集合顺序为：");
        for (int i = 0; i < array.length; i++) {
            System.out.println(list.get(i));
        }
    }
}
