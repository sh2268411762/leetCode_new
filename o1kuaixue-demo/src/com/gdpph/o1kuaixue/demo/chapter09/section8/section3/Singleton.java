package com.gdpph.o1kuaixue.demo.chapter09.section8.section3;

/**
 * 线程不安全懒汉单例模式
 * @author 零壹学堂
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton() {
    }
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
