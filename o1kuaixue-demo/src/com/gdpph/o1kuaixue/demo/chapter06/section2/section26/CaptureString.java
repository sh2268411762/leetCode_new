package com.gdpph.o1kuaixue.demo.chapter06.section2.section26;

/**
 * 使用数值偏移将纯英文字符首字母大写
 * @author 零壹学堂
 */
public class CaptureString {
    public static String captureString(String str) {
        char[] cs = str.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }
    public static void main(String[] args) {
        String str = "java工程师";
        str = captureString(str);
        System.out.println("将str首字母大写，结果为：" + str);
    }
}
