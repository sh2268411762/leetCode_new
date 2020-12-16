package com.gdpph.o1kuaixue.demo.chapter06.section3.section6;

/**
 * 获取StringBuilder容量
 * @author 零壹学堂
 */
public class StringBuilderCapacity {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("空stringBuilder对象容量为：" + stringBuilder.capacity());
        stringBuilder.append("www.01xuetang.com");
        System.out.println("stringBuilder对象添加内容后容量变为：" + stringBuilder.capacity());
    }
}
