package com.gdpph.o1kuaixue.demo.chapter09.section8.section2;

/**
 * 饿汉单例模式
 * @author 零壹学堂
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
    return instance;
    }
}
