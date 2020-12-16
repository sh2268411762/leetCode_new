package com.gdpph.o1kuaixue.demo.chapter09.section2.section19;

/**
 * 对象值类型比较
 * @author 零壹学堂
 */
public class CompareObject {
    public static void main(String[] args) {
        String name1 = "对象值";
        String name2 = "对象值";
        System.out.println("name1和name2是值相等的：" + name1.equals(name2));        System.out.println("name1和name2是引用相等的：" + (name1 == name2));
    }
}
