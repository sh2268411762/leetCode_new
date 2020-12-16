package com.gdpph.o1kuaixue.demo.chapter05.section2.section4;

/**
 * foreach循环示例
 * @author 零壹学堂
 */
public class ForeachLoop {
    public static void main(String[] args) {
        String strs[] = { "零", "壹", "学", "堂" };
        for (String str : strs) {
            System.out.println("每次循环取出的变量值为：" + str);
        }
    }
}
