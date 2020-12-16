package com.gdpph.o1kuaixue.demo.chapter11.section5.section4;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * TreeMap使用介绍
 * @author 零壹学堂
 */
public class UseTreeMap {
    public static void main(String[] args) {
        TreeMap<Person, String> treeMap = new TreeMap<>();
        treeMap.put(new Person(22, "小刘"), "上大学");
        treeMap.put(new Person(11, "小王"), "上小学");
        treeMap.put(new Person(33, "老李"), "已工作");
        Iterator<Person> personIterator = treeMap.keySet().iterator();
        while (personIterator.hasNext()) {
            Person person = personIterator.next();
            System.out.println(person.toString());
        }
    }
}
