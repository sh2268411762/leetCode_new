package com.gdpph.o1kuaixue.demo.chapter06.section2.section9;

/**
 * 查找字符串-indexOf方法
 * @author 零壹学堂
 */
public class SearchString {
    public static void main(String[] args) {
        String str = "零abc壹abc学abc堂abc";
        int ascii = (int) 'a'; // 获取 'a' 字符的ASCII码值
        int i = 0;
        int count = 0; // 存储'a'出现的次数
        while (i < str.length()) {
            int index = str.indexOf(ascii, i);
            System.out.println("从索引1开始查询，'a'在str对象中出现的索引位置为：" + index);
            if (index > 0) {
                i = index + 1; // 步进赋值，使得下一次循环从当前找到字符串的索引+1的位置开始查询
                count++; // 计数加1
            } else {
                break; //未查找到'a',跳出循环
            }
        }
        System.out.println("'a'字符在str对象中共出现次数：" + count);
    }
}
