package com.gdpph.o1kuaixue.demo.chapter04.section2.section1;

/**
 * 方法定义和使用
 * @author 零壹学堂
 */
public class MethodDefination {
    static void printMethod(String name, int age, String wish) {
        System.out.println("大家好，我叫" + name + " ,我今年 " + age + " 岁啦，我的愿望是 " + wish);
    }

    public static void main(String[] args) {
        printMethod("零壹学堂", 2, "Java语言发展越来越好");
        printMethod("小零", 22, "做最专业的Java工程师");
    }
}
