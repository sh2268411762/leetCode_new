package com.gdpph.o1kuaixue.demo.chapter09.section2.section14;

/**
 * 访问成员属性和方法——其他类调用Job类
 * @author 零壹学堂
 */
public class Job {
    public String name = "Java工程师";

    public void findJob() {
        System.out.println(name); // 访问成员属性
    }
}
