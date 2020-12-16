package com.gdpph.o1kuaixue.demo.chapter16.section2.section1;

/**
 * 创建线程示例
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo("线程-1");
        thread1.start();
        ThreadDemo thread2 = new ThreadDemo("线程-2");
        thread2.start();
    }
}
