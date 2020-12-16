package com.gdpph.o1kuaixue.demo.chapter03.section5.section5;

/**
 * 变量定义
 * @author 零壹学堂
 */
public class VariableDefination {
    private static int count = 1; // 类变量
    public String name = "零壹学堂"; // 类中实例变量

    public static void main(String[] args) {
        boolean isTrue; // 方法中变量，可以不赋值，但在使用前必须赋值
        String passWord; // 方法中变量，可以不赋值，但在使用前必须赋值
        passWord = "www.01xuetang.com";
        count++;
        isTrue = false;
        VariableDefination varible = new VariableDefination();
        System.out.println("类静态变量count=" + count);
        System.out.println("类实例变量name=" + varible.name);
        System.out.println("方法变量isTrue=" + isTrue);
        System.out.println("方法变量passWord=" + passWord);
    }
}
