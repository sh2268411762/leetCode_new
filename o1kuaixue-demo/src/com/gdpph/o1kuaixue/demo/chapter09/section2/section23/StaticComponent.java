package com.gdpph.o1kuaixue.demo.chapter09.section2.section23;

/**
 * 静态变量示例
 * @author 零壹学堂
 */
public class StaticComponent {
    static String name = "这是静态变量";

    public static void main(String[] args) {
        StaticComponent a1 = new StaticComponent();
        StaticComponent a2 = new StaticComponent();
        System.out.println("静态变量原值：" + a1.name);
        a1.name = "静态变量值变更";
        System.out.println("a1:" + a1.name);
        System.out.println("a2" + a2.name);
    }
}
