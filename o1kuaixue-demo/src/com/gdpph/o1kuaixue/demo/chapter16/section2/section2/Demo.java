package com.gdpph.o1kuaixue.demo.chapter16.section2.section2;

/**
 * 创建线程示例
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        RunnableDemo thread1 = new RunnableDemo("线程-1");
        thread1.start();
        RunnableDemo thread2 = new RunnableDemo("线程-2");
        thread2.start();
    }
}
