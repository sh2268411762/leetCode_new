package com.gdpph.o1kuaixue.demo.chapter11.section4.section4;

import java.util.*;

/**
 * TreeSet使用介绍
 * @author 零壹学堂
 */
public class UseTreeSetMethod {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<Person> personSet = new TreeSet<>();
        personSet.add(new Person(26, "王一"));
        personSet.add(new Person(22, "张二"));
        personSet.add(new Person(33, "刘三"));
        Iterator<Person> personIterator = personSet.iterator();
        System.out.println("按照年龄排序：");
        while (personIterator.hasNext()) {
            Person person = personIterator.next();
            System.out.println("姓名：" + person.name + ",年龄：" + person.age);
        }
    }
}
