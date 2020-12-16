package com.gdpph.o1kuaixue.demo.chapter06.section2.section32;

import java.util.Date;

/**
 * 时间转换符
 *
 * @author 零壹学堂
 */
public class FormatTimeString {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format("当前系统时间为：%tH小时%tM分钟%tS秒", date, date, date));
    }
}
