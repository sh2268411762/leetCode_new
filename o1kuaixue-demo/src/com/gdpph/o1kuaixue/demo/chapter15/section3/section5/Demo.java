package com.gdpph.o1kuaixue.demo.chapter15.section3.section5;

import java.lang.reflect.*;
/**
 * NoSuchMethodException异常
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        try {
            Class<Cat> cls = Cat.class;
            Cat obj=(Cat)cls.newInstance();
            Method target=cls.getDeclaredMethod("desc", String.class);
        } catch (InstantiationException e) {
            System.out.println("捕获异常：" + e.getClass().getName());
            System.out.println("异常内容为：" + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println("捕获异常：" + e.getClass().getName());
            System.out.println("异常内容为：" + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("捕获异常：" + e.getClass().getName());
            System.out.println("异常内容为：" + e.getMessage());
        }
    }
}
