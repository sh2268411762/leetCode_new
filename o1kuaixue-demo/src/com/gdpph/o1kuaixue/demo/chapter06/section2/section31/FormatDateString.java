package com.gdpph.o1kuaixue.demo.chapter06.section2.section31;

import java.util.Date;

/**
 * 日期转换符
 *
 * @author 零壹学堂
 */
public class FormatDateString {
    public static void main(String[] args) {
        Date date = new Date(); // 创建一个日期对象
        System.out.println(String.format("现在是哪年哪月哪日：%tY年%tB月%td日", date, date, date));
    }
}
