package com.gdpph.o1kuaixue.demo.chapter12.section1.section6;

import java.lang.reflect.Method;

/**
 * @author 零壹学堂
 */
public class Test {

    public static void main(String[] args) {
        printClassMethods(new Person("Jack", 24));
    }

    public static void printClassMethods(Object obj) {
        Class c = obj.getClass();
        Method[] methods = c.getDeclaredMethods();

        System.out.println("打印类的方法信息");
        for (Method method : methods) {
            // 获取方法的返回值的类类型
            Class returnType = method.getReturnType();
            System.out.print(returnType.getSimpleName());

            // 获取方法名称
            System.out.print(" " + method.getName() + " (");

          	// 获取参数列表
            Class[] parameterTypes = method.getParameterTypes();
            for (Class paramType: parameterTypes) {
                System.out.print(paramType.getSimpleName() + ", ");
            }
            System.out.println(" )");
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say(String message) {
        System.out.println("Saying " + message);
    }

    public void run() {
        System.out.println("Running...");
    }

    public void swim() {
        System.out.println("Swimming...");
    }
}
