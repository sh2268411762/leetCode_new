package com.gdpph.o1kuaixue.demo.chapter09.section5.section3;

/**
 * final修饰变量
 * @author 零壹学堂
 */
public class FinalVariable {
    private final int id = 1010; // 基本类型
    private final Person person = new Person(); // 对象引用

    public static void main(String[] args) {
        FinalVariable finalVariable = new FinalVariable();
        System.out.println("id=" + finalVariable.id);
        System.out.println(finalVariable.person.name); // 名字
        finalVariable.person.name = "更改名字";
        System.out.println(finalVariable.person.name); // 更改名字
    }
}
