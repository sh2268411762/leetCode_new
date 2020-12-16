package com.gdpph.o1kuaixue.demo.chapter06.section2.section19;

/**
 * 有限次字符串分割
 * @author 零壹学堂
 */
public class SplitString {
    public static void main(String[] args) {
        String str = "计算111机a编b程c工程师";
        String[] strArray1 = str.split("[\\da-z]+", 1); // 限定拆分1次
        System.out.println("分割1次后得到数组长度：" + strArray1.length);
        for (String element : strArray1) {
            System.out.println("分割1次后字符串数组中内容依次为：" + element);
        }
        String[] strArray2 = str.split("[\\da-z]+", 3); // 限定拆分3次
        System.out.println("分割3次后得到数组长度：" + strArray2.length);
        for (String element : strArray2) {
            System.out.println("分割后字符串数组中内容依次为：" + element);
        }
    }
}
