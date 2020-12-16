package com.gdpph.o1kuaixue.demo.chapter09.section2.section22;

/**
 * 静态变量示例
 * @author 零壹学堂
 */
public class StaticComponent {
    static String name = "这是静态变量";

    public static void main(String[] args) {
        System.out.println("成员方法调用：" + name);
        System.out.println("通过类型.变量调用：" + StaticComponent.name);
        StaticComponent staticComponent = new StaticComponent();
        System.out.println("通过实例化调用：" + staticComponent.name);
    }
}
