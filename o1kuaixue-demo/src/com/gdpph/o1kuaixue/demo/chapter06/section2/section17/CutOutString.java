package com.gdpph.o1kuaixue.demo.chapter06.section2.section17;

/**
 * 字符串截取
 * @author 零壹学堂
 */
public class CutOutString {
    public static void main(String[] args) {
        String str = "零壹学堂，计算机编程工程师的摇篮";
        // 左闭右开区间，即从第5个到第9个字符
        str = str.substring(5, 10);
        System.out.println("str从索引5到10之间截取的子字符串为：" + str);
    }
}
