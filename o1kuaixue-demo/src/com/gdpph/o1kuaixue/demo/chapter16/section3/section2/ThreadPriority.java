package com.gdpph.o1kuaixue.demo.chapter16.section3.section2;

/**
 * 线程优先级
 * @author 零壹学堂
 */
public class ThreadPriority implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出：" + i);
        }
    }
    public static void main(String[] args) {
        Thread maxPriority = new Thread(new ThreadPriority(), "高优先级线程");
        Thread minPriority = new Thread(new ThreadPriority(), "低优先级线程");
        maxPriority.setPriority(Thread.MAX_PRIORITY); //高优先级线程
        minPriority.setPriority(Thread.MIN_PRIORITY); //低优先级线程
        maxPriority.start();
        minPriority.start();
    }
}
