package com.gdpph.o1kuaixue.demo.chapter06.section2.section16;

/**
 * 字符串截取
 * @author 零壹学堂
 */
public class CutOutString {
    public static void main(String[] args) {
        String str = "零壹学堂，计算机编程工程师的摇篮";
        str = str.substring(5);
        System.out.println("str从索引5处开始截取到结尾的子字符串为：" + str);
    }
}
