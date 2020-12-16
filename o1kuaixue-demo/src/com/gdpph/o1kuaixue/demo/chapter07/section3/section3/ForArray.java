package com.gdpph.o1kuaixue.demo.chapter07.section3.section3;

/**
 * for嵌套循环遍历多维数组
 * @author 零壹学堂
 */
public class ForArray {
    public static void main(String[] args) {
        char charArray[][] = new char[][] { { '零', '壹', '学', '堂' }, { 'a', 'b', 'c' } };
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                System.out.println("依次获取数组内容，第" + i + "+" + j + "索引元素为：" + charArray[i][j]);
            }
        }
    }
}
