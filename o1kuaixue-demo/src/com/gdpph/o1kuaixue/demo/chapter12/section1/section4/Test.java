package com.gdpph.o1kuaixue.demo.chapter12.section1.section4;

import java.lang.reflect.Constructor;

/**
 * @author 零壹学堂
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 通过forName()方法获取Class对象
        Class clazz = Class.forName("com.demo.Person");

        // 1.获取Constructor[]数组并打印构造方法信息
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("打印构造方法信息: " + constructor);
        }

        // 2.获取单个默认Constructor，并创建类的实例
        Constructor constructor1 = clazz.getConstructor();
        // 调用Constructor的newInstance()方法，实例化对象
        Object object1 = constructor1.newInstance();
        Person person1 = (Person) object1;
        person1.say();

        // 3.获取带参的Constructor，并创建类的实例
        Constructor constructor2 = clazz.getConstructor(String.class, int.class);
        // 调用Constructor的newInstance()方法，实例化对象
        Object object2 = constructor2.newInstance("Mike", 22);
        Person person2 = (Person) object2;
        person2.say();

    }
}

class Person {
    private String name = "Jack";
    private int age = 10;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say(){
        System.out.println("姓名: " + name + ", 年龄: " + age);
    }
}
