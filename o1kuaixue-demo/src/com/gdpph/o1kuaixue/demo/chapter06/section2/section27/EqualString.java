package com.gdpph.o1kuaixue.demo.chapter06.section2.section27;

/**
 * 字符串比较
 * @author 零壹学堂
 */
public class EqualString {
    public static void main(String[] args) {
        String str1 = new String("01xuetang");
        String str2 = str1;
        String str3 = new String("01xuetang");
        boolean retVal;
        retVal = str1.equals(str2);
        System.out.println("str1与str2比较结果：" + retVal);
        retVal = str1.equals(str3);
        System.out.println("str1与str3比较结果：" + retVal);
        retVal = str1.equals(null);
        System.out.println("str1与null比较结果：" + retVal);
        // 使用==与equals区别
        retVal = str1 == str2; // str1和str2都指向同一个内存地址
        System.out.println("str1与str2使用==比较结果：" + retVal);
        str2 = new String("01xuetang"); // str2指向一个相同的内容但是内存地址不同的字符串
        retVal = str1 == str2; // str1和str2指向不同内存地址
        System.out.println("str1与str2使用==比较结果：" + retVal);
        str1 = "www.01xuetang.com";
        str2 = "www.01xuetang.com";
        retVal = str1 == str2; // str1和str2指定同一个字符串常量
        System.out.println("str1与str2使用==比较结果：" + retVal);
    }
}
