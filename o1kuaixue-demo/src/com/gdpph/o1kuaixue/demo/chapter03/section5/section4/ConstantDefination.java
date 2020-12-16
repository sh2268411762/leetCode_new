package com.gdpph.o1kuaixue.demo.chapter03.section5.section4;

/**
 * 常量定义
 * @author 零壹学堂
 */
public class ConstantDefination {
    private static final Person PERSON = new Person("零壹学堂");

    public static void main(String[] args) {
        System.out.println("定义常量：" + PERSON.name);
    }
}
