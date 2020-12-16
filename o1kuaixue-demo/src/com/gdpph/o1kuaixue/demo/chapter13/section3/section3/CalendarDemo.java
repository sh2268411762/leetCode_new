package com.gdpph.o1kuaixue.demo.chapter13.section3.section3;

import java.util.Calendar;

/**
 * Calendar.getInstance()方法
 *
 * @author 零壹学堂
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("当前日期为：" + cal.getTime());
        System.out.println("获取年份：" + cal.get(Calendar.YEAR));
        System.out.println("获取月份：" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("获取日期：" + cal.get(Calendar.DATE));
        System.out.println("获取小时：" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("获取分钟：" + cal.get(Calendar.MINUTE));
        System.out.println("获取秒钟：" + cal.get(Calendar.SECOND));
        System.out.println("获得星期几：" + cal.get(Calendar.DAY_OF_WEEK));// （1代表星期日、2代表星期1、3代表星期二...以此类推）
    }
}
