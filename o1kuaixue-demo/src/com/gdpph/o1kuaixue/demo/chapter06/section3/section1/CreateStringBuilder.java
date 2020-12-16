package com.gdpph.o1kuaixue.demo.chapter06.section3.section1;

/**
 * 创建StringBuilder对象
 * @author 零壹学堂
 */
public class CreateStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder(); // 空对象
        StringBuilder stringBuilder2 = new StringBuilder(32); // 创建初始容量为32的对象
        StringBuilder stringBuilder3 = new StringBuilder("零壹学堂"); // 创建带初始值的对象
        StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3); // 创建包括入参字符序列的对象
        System.out.println("创建对象为：" + stringBuilder1);
        System.out.println("创建对象为：" + stringBuilder2);
        System.out.println("创建对象为：" + stringBuilder3);
        System.out.println("创建对象为：" + stringBuilder4);
    }
}
