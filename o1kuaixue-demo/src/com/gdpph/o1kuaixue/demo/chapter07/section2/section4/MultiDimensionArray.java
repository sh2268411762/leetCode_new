package com.gdpph.o1kuaixue.demo.chapter07.section2.section4;

/**
 * 多维数组创建
 * @author 零壹学堂
 */
public class MultiDimensionArray {
    public static void main(String[] args) {
        int intArray[][] = new int[2][2]; // 创建整型二维数组
        String[][] strArray = new String[4][4]; // 创建二维数组
        strArray[0][0] = "零"; // 二维数组赋值
        strArray[1][1] = "壹";
        strArray[2][2] = "学";
        strArray[3][3] = "堂";
        String[][][] strArray1 = new String[2][2][2]; // 创建三维数组
    }
}
