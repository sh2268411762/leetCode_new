package com.gdpph.o1kuaixue.demo.chapter09.section2.section15;

/**
 * 变量作用域——类级变量
 * @author 零壹学堂
 */
public class Person {
    public static String name = "小王";
    private void changeName() {
        name = "老王";
    }

    public static void main(String[] args) {
        System.out.println("类级变量的访问：" + name);
        Person person = new Person();
        person.changeName();
        System.out.println("变更名字后：" + name);
    }
}
