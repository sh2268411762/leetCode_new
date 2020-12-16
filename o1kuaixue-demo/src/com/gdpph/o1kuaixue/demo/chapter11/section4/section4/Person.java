package com.gdpph.o1kuaixue.demo.chapter11.section4.section4;

import java.util.*;

/**
* Person类定义
*/
public class Person implements Comparable<Person> {
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int age;
    String name;

    public int compareTo(Person person) {
        int num = this.age - person.age;
        return num;
    }
}
