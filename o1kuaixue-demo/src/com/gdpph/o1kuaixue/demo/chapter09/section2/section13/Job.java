package com.gdpph.o1kuaixue.demo.chapter09.section2.section13;

/**
 * 访问成员属性和方法——同一个类里
 * @author 零壹学堂
 */
public class Job {
    private String name = "Java工程师";

    private void findJob() {
        System.out.println(name); // 访问成员属性
    }

    private void prepareWork() {
        findJob(); //访问成员变量
    }
}
