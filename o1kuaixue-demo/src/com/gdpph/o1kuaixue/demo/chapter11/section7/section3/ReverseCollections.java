package com.gdpph.o1kuaixue.demo.chapter11.section7.section3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections中reverse()方法
 *
 * @author 零壹学堂
 */
public class ReverseCollections {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        double array[] = { 3, 101, 345, 987, 1 };
        System.out.println("混排前数字集合顺序为：");
        for (int i = 0; i < array.length; i++) {
            list.add(new Double(array[i]));
            System.out.println(list.get(i));
        }
        Collections.reverse(list);
        System.out.println("混排后数字集合顺序为：");
        for (int i = 0; i < array.length; i++) {
            System.out.println(list.get(i));
        }
    }
}
