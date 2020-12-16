package com.gdpph.o1kuaixue.demo.chapter06.section2.section7;

/**
 * 查询字符串-使用charAt方法查询指定索引处的字符
 * @author 零壹学堂
 */
public class SearchString {
    public static void main(String[] args) {
        String str = "零壹学堂";
        for (int i = 0; i < str.length(); i++) {
            // 按索引顺序打印出str字符串中的字符
            System.out.println("依次查询str字符串中字符，第" + i + "索引字符为" + str.charAt(i));
        }
    }
}
