package com.gdpph.o1kuaixue.demo.chapter09.section8.section6;

/**
 * 静态内部类单例模式
 * @author 零壹学堂
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton SINGLETON = new Singleton();
    }
    private Singleton() {
    }
    public static final Singleton getSingleton() {
        return SingletonHolder.SINGLETON;
    }
}
