package com.gdpph.o1kuaixue.demo.chapter06.section2.section35;

/**
 * compareToIgnoreCase()方法
 *
 * @author 零壹学堂
 */
public class StringCompare {
    public static void main(String[] args) {
        String a = "A";
        String b = "a";
        System.out.println("按照ASCII码前后顺序对比A和a，不区分大小写：" + a.compareToIgnoreCase(b));
    }
}
