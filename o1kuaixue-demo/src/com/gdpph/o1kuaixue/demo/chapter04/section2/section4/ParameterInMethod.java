package com.gdpph.o1kuaixue.demo.chapter04.section2.section4;

/**
 * 引用类型按引用传递参数
 * @author 零壹学堂
 */
public class ParameterInMethod {
    private static void calculate(Person person) {
        System.out.println("计算前，函数内部的number变量值为：" + person.number);
        person.number = person.number * 2 + 3;
        System.out.println("计算后，函数内部的number变量值为：" + person.number);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.number = 5;
        System.out.println("调用函数前，外部的number变量值为：" + person.number);
        calculate(person);
        System.out.println("调用函数后，外部的number变量值为：" + person.number);
    }
}
