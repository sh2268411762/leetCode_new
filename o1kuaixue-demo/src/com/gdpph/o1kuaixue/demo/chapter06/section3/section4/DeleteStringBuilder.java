package com.gdpph.o1kuaixue.demo.chapter06.section3.section4;

/**
 * delete方法指定索引范围字符
 * @author 零壹学堂
 */
public class DeleteStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("零壹学堂www.01xuetang.com");
        System.out.println("删除前内容为：" + stringBuilder);
        stringBuilder.delete(0, 4);
        System.out.println("删除后内容为：" + stringBuilder);
        stringBuilder.delete(2, 2); // 不会删除任何内容
        System.out.println("start和end索引相同不会执行删除操作：" + stringBuilder);
    }
}
