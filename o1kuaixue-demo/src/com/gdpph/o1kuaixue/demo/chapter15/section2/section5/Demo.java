package com.gdpph.o1kuaixue.demo.chapter15.section2.section5;

import java.io.IOException;
/**
 * try catch示例，多条catch捕获异常
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        try {
            Class.forName("className");
        } catch (IllegalArgumentException e) {
            System.out.println("捕获异常：" + e.getClass().getName());
            System.out.println("异常内容为：" + e.getMessage());
        } catch (Exception e) {
            System.out.println("捕获异常：" + e.getClass().getName());
            System.out.println("异常内容为：" + e.getMessage());
        }
    }
}
