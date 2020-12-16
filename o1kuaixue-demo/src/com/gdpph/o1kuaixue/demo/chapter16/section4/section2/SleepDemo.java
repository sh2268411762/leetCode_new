package com.gdpph.o1kuaixue.demo.chapter16.section4.section2;

/**
 * 线程休眠操作
 *
 * @author 零壹学堂
 */
public class SleepDemo {
    public static void main(String[] args) {
        try {
            ThreadA t1 = new ThreadA("t-1"); // 新建线程
            t1.start(); // 启动线程
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static class ThreadA extends Thread {
        public ThreadA(String name) {
            super(name);
        }
        public void run() {
            try {
                System.out.printf("%s 线程开始\n", this.getName());
                for (int i = 0; i < 1000000; i++) {
                    if (i == 10000) {
                        System.out.println("i循环到10000时线程休眠100毫秒");
                        this.sleep(100);
                    }
                }
                System.out.printf("%s 线程结束\n", this.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
