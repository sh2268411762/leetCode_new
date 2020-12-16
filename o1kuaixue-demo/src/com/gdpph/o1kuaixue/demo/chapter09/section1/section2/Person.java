package com.gdpph.o1kuaixue.demo.chapter09.section1.section2;

/**
 * Java语言对象示例
 * @author 零壹学堂
 */
public class Person {
    // 数据
    private String name;
    private int age;
    private float height;
    private float weight;

    // 算法方法
    Person(String name,int age,float height,float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // 算法方法
    private void printPerson() {
        System.out.println(name+age+height+weight);
    }
}
