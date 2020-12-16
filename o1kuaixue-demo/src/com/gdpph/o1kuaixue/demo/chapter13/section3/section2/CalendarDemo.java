package com.gdpph.o1kuaixue.demo.chapter13.section3.section2;

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
        cal.set(2008, 12 - 1, 31);// 月份是从0开始，需要减1
        System.out.println("修改后日期为：" + cal.getTime());
    }
}
