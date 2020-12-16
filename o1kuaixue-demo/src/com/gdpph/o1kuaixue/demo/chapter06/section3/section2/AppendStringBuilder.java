package com.gdpph.o1kuaixue.demo.chapter06.section3.section2;

/**
 * 将指定内容追加到StringBuilder对象末尾
 * @author 零壹学堂
 */
public class AppendStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("添加boolean值：");
        stringBuilder.append(true);
        stringBuilder.append("\n");//添加换行
        stringBuilder.append("添加字符值：");
        stringBuilder.append('c');
        stringBuilder.append("\n");//添加换行
        stringBuilder.append("添加整型值：");
        stringBuilder.append(1010);
        stringBuilder.append("\n");//添加换行
        stringBuilder.append("添加浮点值：");
        stringBuilder.append(10.12f);
        stringBuilder.append("\n");//添加换行
        stringBuilder.append("添加StringBuidler对象值：");
        stringBuilder.append(new StringBuilder("零壹学堂"));
        System.out.println(stringBuilder);
    }
}
