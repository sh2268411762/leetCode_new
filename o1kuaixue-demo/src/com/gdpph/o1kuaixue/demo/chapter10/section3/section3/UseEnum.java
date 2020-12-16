package com.gdpph.o1kuaixue.demo.chapter10.section3.section3;

/**
 * enum方法使用
 *
 * @author 零壹学堂
 */
public class UseEnum {
    public static void main(String[] args) {
        ColorEnum colorArray[] = ColorEnum.values();
        for (int i = 0; i < colorArray.length; i++) {
            System.out.println("依次打印枚举类型成员：" + colorArray[i].color);
        }
    }
}
