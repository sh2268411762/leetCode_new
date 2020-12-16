package com.gdpph.o1kuaixue.demo.chapter16.section4.section3;

/**
 * 中断线程
 * @author 零壹学堂
 */
public class StopDemo {
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
        private boolean isContinue = true;
        public void run() {
            while (isContinue) {
                try {
                    System.out.printf("%s 线程开始\n", this.getName());
                    for (int i = 0; i < 1000000; i++) {
                        if (i == 10000) {
                            isContinue = false;
                            System.out.printf("%s 中断线程\n", this.getName());
                            break;
                        }
                    }
                    System.out.printf("%s 线程结束\n", this.getName());
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }
        }
    }
}
