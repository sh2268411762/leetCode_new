package com.gdpph.o1kuaixue.demo.chapter13.section5.section1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * SimpleDateFormat类
 *
 * @author 零壹学堂
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
        System.out.println(simpleDateFormat.toString());// 对象内存地址
        System.out.println("格式化当前时间为：" + simpleDateFormat.format(new Date()));
    }
}
