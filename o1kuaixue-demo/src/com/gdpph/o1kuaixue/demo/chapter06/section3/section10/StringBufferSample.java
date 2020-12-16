package com.gdpph.o1kuaixue.demo.chapter06.section3.section10;

/**
 * StringBuffer使用
 * @author 零壹学堂
 */
public class StringBufferSample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("零壹学堂");
        stringBuffer.append("www.01xuetang.com");
        System.out.println("创建stringBuffer对象：" + stringBuffer);
        System.out.println("stringBuffer的容量为：" + stringBuffer.capacity());
        System.out.println("stringBuffer的长度为：" + stringBuffer.length());
        stringBuffer.replace(0, 4, "Java学习");
        System.out.println("replace替换后为：" + stringBuffer);
        stringBuffer.insert(6, "工程师");
        System.out.println("insert方法插入后为：" + stringBuffer);
    }
}
