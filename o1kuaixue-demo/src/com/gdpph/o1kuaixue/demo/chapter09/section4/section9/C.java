package com.gdpph.o1kuaixue.demo.chapter09.section4.section9;

/**
 * C类
 * @author 零壹学堂
 */
public class C extends B {
    C() {
        System.out.println("C类构造方法");
    }

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.name);
        System.out.println(c.color);
    }
}
