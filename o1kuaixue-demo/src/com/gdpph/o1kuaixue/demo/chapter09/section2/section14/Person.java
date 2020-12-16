package com.gdpph.o1kuaixue.demo.chapter09.section2.section14;

/**
 * 访问成员属性方法——其他类调用
 * @author 零壹学堂
 */
public class Person {
    public static void main(String[] args) {
        Job job = new Job();
        System.out.println(job.name);
        job.findJob(); //调用其他类的成员方法
    }
}
