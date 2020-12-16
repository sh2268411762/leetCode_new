package com.gdpph.o1kuaixue.demo.chapter09.section4.section10;

/**
 * 重载示例
 * @author 零壹学堂
 */
public class OverLoadSample {
    public void printName() {
        System.out.println("零入参方法调用");
    }

    public void printName(String name) {
        System.out.println("一个入参方法调用：" + name);
    }

    public void printName(int i) {
        System.out.println("不同类型入参方法调用" + i);
    }

    public void printName(String name, String id) {
        System.out.println("不同入参个数方法调用");
    }

    public static void main(String[] args) {
        OverLoadSample sample = new OverLoadSample();
        sample.printName();
        ;
        sample.printName("一个入参");
        sample.printName(1);
        sample.printName("入参个数不同", "入参个数不同");
    }
}
