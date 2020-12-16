package com.gdpph.o1kuaixue.demo.chapter09.section5.section5;

/**
 * 方法入参被final修饰
 * @author 零壹学堂
 */
public class FinalMethodParam {
    public static void finalParamMethod(final String name) {
        // name变量不能被修改
//        name = "修改名字";
    }

    public static void main(String[] args) {
        finalParamMethod("名字");
    }
}
