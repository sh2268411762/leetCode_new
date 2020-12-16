package com.gdpph.o1kuaixue.demo.chapter09.section2.section17;

/**
 * 变量作用域——对象成员变量
 * @author 零壹学堂
 */
public class Person {
    public String name = "小王"; // 成员变量
    private void changeName() {
        name = "老王"; // 成员变量可以在类中任意代码处访问
    }

    public static void main(String[] args) {
        // System.out.println("成员变量的直接访问：" + name); // 不能直接访问非静态的变量
        Person person = new Person();
        System.out.println("对象实例化后成员变量的访问：" + person.name);
    }
}
