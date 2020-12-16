package com.gdpph.o1kuaixue.demo.chapter11.section3.section3;

import java.util.*;

/**
 * ArrayList中Get和Set方法使用
 *
 * @author 零壹学堂
 */
public class ArrayListGetSet {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add(0, "A");
        arrayList.add(1, "B");
        arrayList.set(1, "C");
        System.out.println("集合中第1个元素为：" + arrayList.get(0)); // A
        System.out.println("集合中第2个元素为：" + arrayList.get(1)); // C
    }
}
