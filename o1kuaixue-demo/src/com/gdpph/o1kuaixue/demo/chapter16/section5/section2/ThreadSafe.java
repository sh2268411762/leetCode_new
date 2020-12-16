package com.gdpph.o1kuaixue.demo.chapter16.section5.section2;

/**
 * 线程安全
 * @author 零壹学堂
 */
public class ThreadSafe implements Runnable {
    private Integer key = 0;
    @Override
    public void run() {
        synchronized (key) {
            key++;
            System.out.println(Thread.currentThread().getName() + ":" + key);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        for(int i=0; i<10; i++) {
            new Thread(threadSafe, "线程-" + i).start();
        }
    }
}
