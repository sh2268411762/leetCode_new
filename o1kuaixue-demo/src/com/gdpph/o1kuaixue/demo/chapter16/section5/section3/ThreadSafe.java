package com.gdpph.o1kuaixue.demo.chapter16.section5.section3;

/**
 * 线程安全
 * @author 零壹学堂
 */
public class ThreadSafe implements Runnable {
    private Integer key = 0;
    public synchronized Integer getKey() {
        key++;
        return key;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + getKey());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }
    public static void main(String[] args) {
        ThreadSafe st = new ThreadSafe();
        for (int i = 0; i < 10; i++) {
            new Thread(st, "线程-" + i).start();
        }
    }
}
