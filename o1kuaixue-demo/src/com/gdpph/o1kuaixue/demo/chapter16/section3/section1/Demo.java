package com.gdpph.o1kuaixue.demo.chapter16.section3.section1;

/**
 * 查看线程状态
 * @author 零壹学堂
 */
public class Demo implements Runnable {
    public synchronized void notifying() throws InterruptedException {
        notify();
    }
    public synchronized void waiting() throws InterruptedException {
        wait();
    }
    public void run() {
        try {
            System.out.println("当前线程休息100ms");
            Thread.sleep(100);
            waiting();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException{
        Demo demo = new Demo();
        Thread thread = new Thread(demo);
        System.out.println("创建线程后状态为：" + thread.getState());
        thread.start();
        System.out.println("启动线程后装填为：" + thread.getState());
        Thread.sleep(50);
        System.out.println("主线程睡眠50ms后状态为：" + thread.getState());
        Thread.sleep(100);
        System.out.println("wait后状态为：" + thread.getState());
        demo.notifying();
        System.out.println("返回同步方法前状态：" + thread.getState());
        thread.join();
        System.out.println("结束线程后状态为：" + thread.getState());
    }

}
