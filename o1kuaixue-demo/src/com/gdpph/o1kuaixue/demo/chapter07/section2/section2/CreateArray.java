package com.gdpph.o1kuaixue.demo.chapter07.section2.section2;

/**
 * 创建数组,引用赋值
 * @author 零壹学堂
 */
public class CreateArray {
    public static void main(String[] args) {
        //使用new初始化数组
        char charArray[] = new char[] { '零', '壹', '学', '堂' };
        char anotherArray[] = charArray;
        boolean compareResult = charArray == anotherArray;
        System.out.println("charArray和anotherArray引用地址相同吗？" + compareResult);
    }
}
