package com.gdpph.o1kuaixue.demo.chapter07.section2.section6;

/**
 * 多维数组创建
 * @author 零壹学堂
 */
public class MultiDimensionArray {
    public static void main(String[] args) {
        String[][] strArray = new String[4][4]; // 创建二维数组
        strArray[0][0] = "零"; // 二维数组赋值
        strArray[1][1] = "壹";
        strArray[2][2] = "学";
        strArray[3][3] = "堂";
        System.out.println("通过索引访问数组中元素：" + strArray[2][2]);
    }
}
