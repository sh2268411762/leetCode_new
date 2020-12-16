package com.gdpph.o1kuaixue.demo.chapter05.section1.section15;

/**
 * switch语句和enum枚举类使用
 * @author 零壹学堂
 */
public class SwitchWithEnumSample {
    public static void main(String[] args) {
        String name = "小张";
        switch (PersonEnum.getPersonName(name)) {
        case XIAO_WANG:
            System.out.println(name + "的名字是" + PersonEnum.XIAO_WANG.getName());
            break;
        case XIAO_LIU:
            System.out.println(name + "的名字是" + PersonEnum.XIAO_LIU.getName());
            break;
        case XIAO_ZHANG:
            System.out.println(name + "的名字是" + PersonEnum.XIAO_ZHANG.getName());
            break;
        default:
            System.out.println(name + "的名字找不到");
        }
    }
}
