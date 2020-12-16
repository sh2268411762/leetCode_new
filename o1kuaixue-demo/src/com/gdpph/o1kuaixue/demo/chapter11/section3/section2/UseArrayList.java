package com.gdpph.o1kuaixue.demo.chapter11.section3.section2;

import java.util.*;
/**
 * ArrayList具体使用介绍
 * @author 零壹学堂
 */
public class UseArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("第一个元素");
        list.add("第二个元素");
        list.add("第三个元素");
        list.remove(1);
        // 通过foreach方式遍历所有元素
        for (String element : list) {
            System.out.println("foreach遍历："+element);
        }
        // 通过迭代器遍历所有元素
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("迭代遍历："+iterator.next());
        }
    }
}
