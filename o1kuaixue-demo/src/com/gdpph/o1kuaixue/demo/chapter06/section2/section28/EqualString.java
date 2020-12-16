package com.gdpph.o1kuaixue.demo.chapter06.section2.section28;

/**
 * 字符串比较
 * @author 零壹学堂
 */
public class EqualString {
    public static void main(String[] args) {
        String str1 = new String("01xuetang");
        String str2 = new String("01XueTang");
        boolean retVal;
        retVal = str1.equals(str2);
        System.out.println("str1与str2使用equals比较结果：" + retVal);
        retVal = str1.equalsIgnoreCase(str2);
        System.out.println("str1与str2使用equalsIgnoreCase比较结果：" + retVal);
        retVal = str1.equalsIgnoreCase(null);
        System.out.println("str1与null比较结果：" + retVal);
    }
}
