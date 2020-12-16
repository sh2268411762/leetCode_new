package com.gdpph.o1kuaixue.demo.chapter05.section1.section14;

/**
 * switch条件语句case中没有break语句
 * @author 零壹学堂
 */
public class SwitchSample {
    public static void main(String[] args) {
        String name = "零壹学堂";
        switch (name) {
        case "零壹学堂":
            System.out.println("名称为：" + name);
        default:
            System.out.println("因为case没有break语句，该条语句也会被执行");
        }
    }
}
