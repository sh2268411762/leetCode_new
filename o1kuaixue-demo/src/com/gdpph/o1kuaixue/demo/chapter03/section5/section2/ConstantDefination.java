package com.gdpph.o1kuaixue.demo.chapter03.section5.section2;

/**
 * 常量定义
 * @author 零壹学堂
 */
public class ConstantDefination {
    // 常量名定义重复，编译报错
//    private static final int DAY_SECOND = 24 * 60 * 60;
    private static final int DAY_SECOND = 24 * 60 * 60;

    public static void main(String[] args) {
        System.out.println("全局常量DAY_SECOND：" + DAY_SECOND);
    }
}
