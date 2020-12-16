package com.gdpph.o1kuaixue.demo.chapter10.section4.section4;

/**
 * 泛型方法使用
 *
 * @author 零壹学堂
 */
public class Demo {
    public <T> void toString(T t) {
        System.out.println("入参" + t + "包装类型为：" + t.getClass().getName());
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.toString(1);
        demo.toString(1.234);
        demo.toString(Boolean.TRUE);
        demo.toString("Java编程");
    }
}
