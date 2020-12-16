package com.gdpph.o1kuaixue.demo.chapter09.section5.section1;

/**
 * final修饰类
 * @author 零壹学堂
 */
public final class FinalClass {
    int count = 0;

    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.count++;
        System.out.println("自增加一数值：" + finalClass.count);
    }
}
