package com.gdpph.o1kuaixue.demo.chapter06.section2.section15;

/**
 * replaceFirst方法替换字符串
 * @author 零壹学堂
 */
public class ReplaceFirstString {
    public static void main(String[] args) {
        String str = "零壹abc学abc堂abc";
        str = str.replaceFirst("[a-zA-Z]+", "");
        System.out.println("将str中出现第一组多个紧挨的字母删除：" + str);
    }
}
