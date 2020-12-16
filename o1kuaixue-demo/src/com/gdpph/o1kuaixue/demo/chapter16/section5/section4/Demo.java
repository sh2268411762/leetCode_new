package com.gdpph.o1kuaixue.demo.chapter16.section5.section4;

/**
 * 线程暂停和恢复
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        final Object object = new Object();
        Thread t1 = new Thread() {
            public void run() {
                synchronized (object) {
                    System.out.println("线程1开始...");
                    try {
                        System.out.println("线程1暂停...");
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程1结束...");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (object) {
                    System.out.println("线程2开始...");
                    System.out.println("线程1恢复...");
                    object.notify();
                    System.out.println("线程2结束...");
                }
            }
        };
        t1.start();
        t2.start();

    }
}
