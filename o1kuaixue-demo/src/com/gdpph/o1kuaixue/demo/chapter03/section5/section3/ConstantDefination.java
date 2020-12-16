package com.gdpph.o1kuaixue.demo.chapter03.section5.section3;

/**
 * 常量定义
 * @author 零壹学堂
 */
public class ConstantDefination {
    // 全局int类型常量定义，可以在本类中任何地方使用
    private static final int DAY_SECOND = 24 * 60 * 60;

    private static void printConstant() {
        System.out.println("全局常量DAY_SECOND：" + DAY_SECOND);
    }
    public static void main(String[] args) {
        final char DAY_SECOND = 'x'; // 常量名重复，编译失败
        System.out.println("局部常量DAY_SECOND：" + DAY_SECOND);
        printConstant(); //上一层作用域中的常量
    }
}
