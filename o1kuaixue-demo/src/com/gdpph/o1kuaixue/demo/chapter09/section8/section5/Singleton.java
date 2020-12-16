package com.gdpph.o1kuaixue.demo.chapter09.section8.section5;

/**
 * 双重校验锁单例模式
 * @author 零壹学堂
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton() {
    }
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
