package com.gdpph.o1kuaixue.demo.chapter16.section7.section2;

/**
 * 死锁
 * @author 零壹学堂
 */
public class ThreadTest {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();
    public static void main(String args[]) {
       ThreadA T1 = new ThreadA();
       ThreadB T2 = new ThreadB();
       T1.start();
       T2.start();
    }
    private static class ThreadA extends Thread {
       public void run() {
          synchronized (Lock1) {
             System.out.println("线程1: 持有Lock1对象锁...");

             try { Thread.sleep(10); }
             catch (InterruptedException e) {}
             System.out.println("线程1：等待Lock2对象锁释放...");
             synchronized (Lock2) {
                System.out.println("线程1：同时持有Lock1和Lock2的锁...");
             }
          }
       }
    }
    private static class ThreadB extends Thread {
       public void run() {
          synchronized (Lock1) {
             System.out.println("线程2: 持有Lock2对象锁...");

             try { Thread.sleep(10); }
             catch (InterruptedException e) {}
             System.out.println("线程1: 等待Lock1对象锁释放...");
             synchronized (Lock2) {
                System.out.println("线程2：同时持有Lock1和Lock2的锁...");
             }
          }
       }
    }
 }
