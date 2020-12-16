package com.gdpph.o1kuaixue.demo.chapter06.section2.section36;

/**
 * hashCode()方法
 *
 * @author 零壹学堂
 */
public class StringHashCode {
    public static void main(String[] args) {
        String str = "零壹学堂";
        System.out.println(str + "的哈希值为：" + str.hashCode());
        str = "";
        System.out.println("空字符串哈希值为：" + str.hashCode());
    }
}
