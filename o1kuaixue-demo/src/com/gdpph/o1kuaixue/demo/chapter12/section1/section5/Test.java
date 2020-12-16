package com.gdpph.o1kuaixue.demo.chapter12.section1.section5;

import java.lang.reflect.Field;

/**
 * @author 零壹学堂
 */
public class Test {

    public static void main(String[] args) {
        printClassVariables(new Person());
    }

    // 打印一个类的所有成员变量信息
    public static void printClassVariables(Object obj) {
        Class c = obj.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            // 获取字段的声明类型
            String typeName = fieldType.getSimpleName();
            // 获取字段的名称
            String filedName = field.getName();
            // 打印一个类的所有成员变量信息
            System.out.println("字段的类型信息：" + typeName + ", 名称：" + filedName);
        }
    }

}

class Person {
    private String name = "Jack";
    private int age = 10;
}
