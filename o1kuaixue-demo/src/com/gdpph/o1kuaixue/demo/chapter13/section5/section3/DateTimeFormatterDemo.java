package com.gdpph.o1kuaixue.demo.chapter13.section5.section3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTimeFormatter类
 *
 * @author 零壹学堂
 */
public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.parse("2018-07-25 10:00:00", formatter);
        System.out.println("日期时间为：" + formatter.format(time));
    }
}
