package com.gdpph.o1kuaixue.demo.chapter07.section2.section5;

import java.util.Arrays;

/**
 * 多维数组创建
 * @author 零壹学堂
 */
public class MultiDimensionArray {
    public static void main(String[] args) {
        char[][] charArray = new char[3][]; // 创建二维数组,可以只定义第一维
        charArray[0] = new char[] { '零', '壹', '学', '堂' };
        charArray[1] = new char[3];
        charArray[2] = new char[1];
        // String[][] strArray = new String[][2][3]; // 编译报错
        System.out.println("第0索引维度内容为：" + Arrays.toString(charArray[0]));
    }
}
