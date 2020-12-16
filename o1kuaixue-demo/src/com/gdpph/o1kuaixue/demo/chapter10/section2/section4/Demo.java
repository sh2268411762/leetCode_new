package com.gdpph.o1kuaixue.demo.chapter10.section2.section4;

/**
 * 其他数学函数方法
 *
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("1.23与3.14之间最大值为：" + Math.max(1.23, 3.14));
        System.out.println("3.33与4.44之间最小值为：" + Math.min(3.33, 4.44));
        System.out.println("-5.14绝对值为：" + Math.abs(-5.14));
        System.out.println("-5.14大一些浮点数为：" + Math.nextUp(-5.14));
        System.out.println("-5.14小一些浮点数为：" + Math.nextDown(-5.14));
    }
}
