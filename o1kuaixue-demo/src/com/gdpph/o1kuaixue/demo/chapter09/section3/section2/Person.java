package com.gdpph.o1kuaixue.demo.chapter09.section3.section2;

/**
 * 构造方法
 * @author 零壹学堂
 */
public class Person {
    private String name;
    private int age;

    Person() {
        this.name = "无参名字";
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "姓名：" + name + ",年龄：" + age;
    }
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());
        person = new Person("小王", 22);
        System.out.println(person.toString());
    }
}
