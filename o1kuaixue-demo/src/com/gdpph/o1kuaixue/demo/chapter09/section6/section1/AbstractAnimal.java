package com.gdpph.o1kuaixue.demo.chapter09.section6.section1;

/**
 * 抽象类示例
 * @author 零壹学堂
 */
public abstract class AbstractAnimal {
    public String name;
    public String color;

    public abstract void eat(); // 抽象方法

    public void getDesc() {
        System.out.println("这是动物抽象类");
    }
}
