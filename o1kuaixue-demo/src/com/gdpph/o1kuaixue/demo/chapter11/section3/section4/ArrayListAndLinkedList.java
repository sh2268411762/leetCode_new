package com.gdpph.o1kuaixue.demo.chapter11.section3.section4;

import java.util.*;

/**
 * ArrayList和LinkedList性能对比
 *
 * @author 零壹学堂
 */
public class ArrayListAndLinkedList {
    static final int N = 10000;

    static long countTime(List list) {
        long start = System.currentTimeMillis();
        Object o = new Object();
        for (int i = 0; i < N; i++) {
            list.add(i, o);
        }
        return System.currentTimeMillis() - start;
    }

    static long readList(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0, j = list.size(); i < j; i++) {
            list.get(i);
        }
        return System.currentTimeMillis() - start;
    }

    static List addToList(List list) {
        Object o = new Object();
        for (int i = 0; i < N; i++) {
            list.add(i, o);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("ArrayList添加" + N + "条费时：" + countTime(new ArrayList()));
        System.out.println("LinkedList添加" + N + "条费时：" + countTime(new LinkedList()));
        List listA = addToList(new ArrayList<>());
        List listB = addToList(new LinkedList<>());
        System.out.println("ArrayList查找" + N + "条费时：" + readList(listA));
        System.out.println("LinkedList查找" + N + "条费时：" + countTime(listB));
    }
}
