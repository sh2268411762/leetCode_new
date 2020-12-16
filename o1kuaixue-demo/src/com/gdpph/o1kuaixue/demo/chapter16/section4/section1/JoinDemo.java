package com.gdpph.o1kuaixue.demo.chapter16.section4.section1;

/**
 * 线程加入操作
 * @author 零壹学堂
 */
public class JoinDemo {
    public static void main(String[] args) {
        try {
            ThreadA t1 = new ThreadA("t-1"); // 新建线程
            t1.start(); //启动线程
            t1.join(); // 将线程加入到主线程中，并且主线程会等待t1完成
            System.out.printf("%s线程完成\n", Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static class ThreadA extends Thread {
        public ThreadA(String name) {
            super(name);
        }
        public void run() {
            System.out.printf("%s 线程开始\n", this.getName());
            for (int i = 0; i < 1000000; i++);
            System.out.printf("%s 线程结束\n", this.getName());
        }
    }
}
