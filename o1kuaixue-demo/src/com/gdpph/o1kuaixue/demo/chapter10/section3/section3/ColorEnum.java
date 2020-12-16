package com.gdpph.o1kuaixue.demo.chapter10.section3.section3;

/**
 * 枚举值定义
 *
 * @author 零壹学堂
 */
public enum ColorEnum {
    RED("红色"),
    GREEN("绿色"),
    YELLOW("黄色"),
    BLUE("蓝色");
    public String color;
    private ColorEnum() {
    }
    private ColorEnum(String color) {
        this.color = color;
    }
}
