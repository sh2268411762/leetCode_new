package com.gdpph.o1kuaixue.demo.chapter07.section3.section1;

/**
 * foreach循环遍历数组
 * @author 零壹学堂
 */
public class ForEachArray {
    public static void main(String[] args) {
        char charArray[] = new char[] { '零', '壹', '学', '堂' };
        for (char element : charArray) {
            System.out.println("依次访问数组charArray中的元素：" + element);
        }
    }
}
