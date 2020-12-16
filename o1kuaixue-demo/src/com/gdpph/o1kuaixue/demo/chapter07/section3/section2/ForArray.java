package com.gdpph.o1kuaixue.demo.chapter07.section3.section2;

/**
 * for循环遍历数组
 * @author 零壹学堂
 */
public class ForArray {
    public static void main(String[] args) {
        char charArray[] = new char[] { '零', '壹', '学', '堂' };
        for (int i = 0; i < charArray.length; i++) {
            System.out.println("依次获取数组内容，第" + i + "索引元素为：" + charArray[i]);
        }
    }
}
