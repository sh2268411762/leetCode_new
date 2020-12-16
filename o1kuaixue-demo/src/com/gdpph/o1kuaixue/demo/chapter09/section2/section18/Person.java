package com.gdpph.o1kuaixue.demo.chapter09.section2.section18;

/**
 * 变量作用域——方法or代码块变量的作用域
 * @author 零壹学堂
 */
public class Person {
    private String getName() {
        int id = 10; // 局部变量
        return id + "小王";
    }

    public static void main(String[] args) {
        // id = 11; // 此处无法直接调用getName方法中的id变量
        Person person = new Person();
        for (int i = 0; i < 2; i++) {
            System.out.println("第" + i + "次");
            System.out.println(person.getName());
        }
        // i = 1; // 此处无法直接调用循环语句中的i变量
    }
}
