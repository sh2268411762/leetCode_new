package com.gdpph.o1kuaixue.demo.chapter07.section4.section3;

/**
 * 多维数组长度
 * @author 零壹学堂
 */
public class ArrayLength {
    public static void main(String[] args) {
        char charArray[][] = new char[][] { { '零', '壹', '学', '堂' }, { 'a', 'b', 'c' },{ '0', '1' } };
        System.out.println("charArray二维数组行长度为：" + charArray.length);
        System.out.println("charArray二维数组第0行的列长度为：" + charArray[0].length);
        System.out.println("charArray二维数组第1行的列长度为：" + charArray[1].length);
    }
}
