package com.gdpph.o1kuaixue.demo.chapter11.section5.section2;

import java.util.*;

/**
 * HashMap使用介绍
 * @author 零壹学堂
 */
public class UseHashMap {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("小明", "11岁");
        hashMap.put("小张", "22岁");
        hashMap.put("小刘", "23岁");

        // 使用key集合遍历
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : hashMap.keySet()) {
            System.out.println("key= " + key + " and value= " + hashMap.get(key));
        }

        // 使用Map.Entry的迭代器遍历
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        // 通过Map.entrySet()来遍历
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        // 通过Map.values()遍历所有的值
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : hashMap.values()) {
            System.out.println("value= " + v);
        }
    }
}
