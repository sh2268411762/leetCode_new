package com.gdpph.o1kuaixue.demo.chapter09.section2.section25;

/**
 * 静态代码块示例
 * @author 零壹学堂
 */
public class StaticComponent {
    static {
        System.out.println("静态代码块");
    }
    {
        System.out.println("非静态代码块");
    }

    public static void main(String[] args) {
        StaticComponent a1 = new StaticComponent();
        StaticComponent a2 = new StaticComponent();
    }
}
