package com.gdpph.o1kuaixue.demo.chapter09.section2.section11;

/**
 * 成员方法——方法体用调用其他成员方法
 * @author 零壹学堂
 */
public class Person {
    public String name;
    public static void doSomething() {
        Job job = new Job();
        job.findJavaJob(); // 方法体中调用其他方法
    }

    public static void main(String[] args) {
        doSomething();
    }
}
