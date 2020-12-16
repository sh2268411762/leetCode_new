package com.gdpph.o1kuaixue.demo.chapter16.section5.section1;

/**
 * 线程安全问题
 * @author 零壹学堂
 */
public class ThreadSafe implements Runnable {
    public int count = 19; // 设置当前变量数量
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println(Thread.currentThread().getName() + "线程当前count值为：" + count);
    }
    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        for (int i = 0; i < 5; i++) {
            new Thread(threadSafe).start();
        }
    }
}
