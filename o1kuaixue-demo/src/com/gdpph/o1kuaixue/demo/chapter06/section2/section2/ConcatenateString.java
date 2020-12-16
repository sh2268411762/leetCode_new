package com.gdpph.o1kuaixue.demo.chapter06.section2.section2;

/**
 * 使用“+=”运算符变量自身连接字符串
 * @author 零壹学堂
 */
public class ConcatenateString {
    public static void main(String[] args) {
        String str = "零壹" + "学堂";
        // str = str + "学习编程知识";
        str += "学习编程知识"; // 该句与上面注释的代码含义相同
        System.out.println("变量自身连接字符串常量" + str);
    }
}
