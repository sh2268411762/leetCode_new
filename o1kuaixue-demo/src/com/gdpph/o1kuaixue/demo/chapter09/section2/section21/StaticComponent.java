package com.gdpph.o1kuaixue.demo.chapter09.section2.section21;

/**
 * 静态常量示例
 * @author 零壹学堂
 */
public class StaticComponent {
    public static final int EARTH_RADIUS = 6371;

    public static void main(String[] args) {
        System.out.println("地球半径为" + EARTH_RADIUS + "km");
        System.out.println(StaticComponent.EARTH_RADIUS);
    }
}
