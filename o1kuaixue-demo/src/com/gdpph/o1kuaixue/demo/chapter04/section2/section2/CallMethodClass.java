package com.gdpph.o1kuaixue.demo.chapter04.section2.section2;

/**
 * 调用其他类中的方法
 * @author 零壹学堂
 */
public class CallMethodClass {
    public static void main(String[] args) {
        MethodDefination.printMethod("零壹", 2, "Java语言发展越来越好");
        // 返回数值加2
        System.out.println(MethodDefination.getMethod(20)); // 22
    }
}
