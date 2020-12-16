package com.gdpph.o1kuaixue.demo.chapter03.section1.section3;

public class Food {
    // 成员变量，在Food类中各处可调用，也可被其他类文件调用
    public static String name;
    // 成员变量，在Food类中各处可调用，但不可被其他类文件调用
    private static String size;

    private void eat() {
        // 私有方法，仅可在Food类中被调用
        System.out.println("eat");
    }

    public static void main(String[] args) {
        String variable = "局部变量";
        System.out.println("这个是局部变量" + variable);
        System.out.println("这个是全局变量" + size);
    }
}
