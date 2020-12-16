package com.gdpph.o1kuaixue.demo.chapter11.section4.section2;

import java.util.*;
import java.util.function.Predicate;

/**
 * HashSet使用介绍
 * @author 零壹学堂
 */
public class UseHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("B"); // Set中只会保留一个“B”值的元素
        hashSet.remove("D");
        System.out.println("集合大小为：" + hashSet.size()); //2
        // foreach遍历HashSet对象
        for (String elemet : hashSet) {
            System.out.println("foreach遍历：" + elemet);
        }
        // Iterator迭代器遍历
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("迭代器遍历：" + iterator.next());
        }
    }
}
