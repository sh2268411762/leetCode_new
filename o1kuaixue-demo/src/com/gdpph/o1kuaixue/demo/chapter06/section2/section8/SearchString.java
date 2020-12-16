package com.gdpph.o1kuaixue.demo.chapter06.section2.section8;

/**
 * 查找字符串-indexOf方法
 * @author 零壹学堂
 */
public class SearchString {
    public static void main(String[] args) {
        String str = "零壹学堂abc";
        System.out.println("“壹”在str对象中出现的索引位置为：" + str.indexOf("壹"));
        // 零的索引为0，从1开始无法找到该字符串
        System.out.println("从索引1开始查询，“零”在str对象中出现的索引位置为：" + str.indexOf("零", 1));
        int ascii = (int) 'a'; // 获取 'a' 字符的ASCII码值
        System.out.println("'a'在str对象中出现的索引位置为：" + str.indexOf(ascii));
        System.out.println("从索引1开始查询，'a'在str对象中出现的索引位置为：" + str.indexOf(ascii, 1));
    }
}
