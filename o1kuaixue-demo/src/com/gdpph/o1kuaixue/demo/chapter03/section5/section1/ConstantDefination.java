package com.gdpph.o1kuaixue.demo.chapter03.section5.section1;

/**
 * 常量定义
 * @author 零壹学堂
 */
public class ConstantDefination {
    // 全局int类型常量定义，可以在本类中任何地方使用
    private static final int DAY_SECOND = 24 * 60 * 60;

    public static void main(String[] args) {
        final char CHAR_CONSTANT = 'x'; // char类型常量定义，只能在本代码块中使用
        System.out.println("全局常量DAY_SECOND：" + DAY_SECOND);
        System.out.println("局部常量CHAR_CONSTANT：" + CHAR_CONSTANT);
        System.out.println("使用其他类中的常量，PI为" + Math.PI);
    }
}
