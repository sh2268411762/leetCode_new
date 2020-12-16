package com.gdpph.o1kuaixue.demo.chapter09.section2.section24;

/**
 * 静态方法示例
 * @author 零壹学堂
 */
public class StaticComponent {
    public String name = "实例化成员属性";

    public void nonStaticMethod() {
        System.out.println("实例化成员方法");
    }

    public static void printName() {
        System.out.println("这是静态方法");
        // nonStaticMethod(); // 静态方法中不允许调用非静态方法
    }

    public static void main(String[] args) {
        StaticComponent a1 = new StaticComponent();
        a1.printName();
        StaticComponent.printName();
    }
}
