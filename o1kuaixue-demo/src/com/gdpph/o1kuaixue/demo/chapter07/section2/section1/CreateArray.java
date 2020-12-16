package com.gdpph.o1kuaixue.demo.chapter07.section2.section1;

/**
 * 创建数组
 * @author 零壹学堂
 */
public class CreateArray {
    public static void main(String[] args) {
        int[] emptyArray; // 定义了数组类型，没有内容，无法被访问
        // 直接引用赋值
        int[] intArray = { 10, 11, 12 }; // 指定数组长度为3，分配内存
        //使用new初始化数组
        char charArray[] = new char[] { '零', '壹', '学', '堂' };
        //使用new初始化数组，然后给数组内容赋值
        String stringArray[] = new String[4]; // 指定数组长度为5，分配内存，没有内容
        stringArray[0] = "零";
        stringArray[1] = "壹";
        stringArray[2] = "学";
        stringArray[3] = "堂";
    }
}
