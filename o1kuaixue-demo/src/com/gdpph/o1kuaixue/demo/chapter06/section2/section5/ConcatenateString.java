package com.gdpph.o1kuaixue.demo.chapter06.section2.section5;

/**
 * 使用concat()方法将字符串拼接到指定字符串对象后面
 * @author 零壹学堂
 */
public class ConcatenateString {
    public static void main(String[] args) {
        String str = "零壹学堂";
        str = str.concat("天天向上");
        System.out.println("将字符串\"天天向上\"连接到指定字符串末尾结果为：" + str);
        str.concat("这不会改变str对象内容");
        System.out.println("str对象内容不会被上面语句更改，为：" + str);
    }
}
