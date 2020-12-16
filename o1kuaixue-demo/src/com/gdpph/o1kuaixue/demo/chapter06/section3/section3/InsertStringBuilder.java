package com.gdpph.o1kuaixue.demo.chapter06.section3.section3;

/**
 * insert方法插入对象指定索引位置
 * @author 零壹学堂
 */
public class InsertStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("零壹学堂");
        stringBuilder.insert(0, true); // 索引0处添加true
        stringBuilder.insert(1, 1010); // 索引1处添加整型
        stringBuilder.insert(11, ",Java工程师"); // 索引11处添加字符串
        System.out.println(stringBuilder);
    }
}
