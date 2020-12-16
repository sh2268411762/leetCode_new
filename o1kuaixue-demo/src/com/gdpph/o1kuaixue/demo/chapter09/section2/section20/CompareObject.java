package com.gdpph.o1kuaixue.demo.chapter09.section2.section20;

/**
 * 对象引用类型比较
 * @author 零壹学堂
 */
public class CompareObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println("person1和person2是引用相等的：" + (person1 == person2));
        String name1 = "对象值1"; // 在对象池中存储“对象值1”的引用，同时引用赋值给name1
        String name2 = "对象值1"; // 在对象池中查找到"对象值1"的引用，直接返回给name2
        String name3 = new String("对象值1"); // 在堆中新建一个对象，引用赋值给name3
        String name4 = new String("对象值1"); // 在堆中新建一个对象，引用赋值给name4

        System.out.println("name1和name2是引用相等的：" + (name1 == name2));
        System.out.println("name2和name3是引用相等的：" + (name2 == name3));
        System.out.println("name3和name4是引用相等的：" + (name3 == name4));
    }
}
