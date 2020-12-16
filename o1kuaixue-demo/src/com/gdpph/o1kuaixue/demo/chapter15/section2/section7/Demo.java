package com.gdpph.o1kuaixue.demo.chapter15.section2.section7;

/**
 * finally示例
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        try {
            Class.forName("className");
        } catch (Exception e) {
            System.out.println("捕获异常：" + e.getClass().getName());
            System.out.println("异常内容为：" + e.getMessage());
        } finally{
            System.out.println("finally语句最后执行");
        }
    }
}
