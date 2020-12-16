package com.gdpph.o1kuaixue.demo.chapter05.section1.section13;

/**
 * switch条件语句示例
 * @author 零壹学堂
 */
public class SwitchSample {
    public static void main(String[] args) {
        int number = 101;
        switch (number) {
        case 2:
            System.out.println(number + "等于2");
            break;
        case 20:
            System.out.println(number + "等于20");
            break;
        case 101:
            System.out.println(number + "等于101");
            break;
        default:
            System.out.println(number + "不在定义的条件值中");
        }
        String name = "零壹学堂";
        switch (name) {
        case "零壹":
            System.out.println("零壹");
            break;
        case "零壹学堂":
        default:
            System.out.println("名称为：" + name);
        }
    }
}
