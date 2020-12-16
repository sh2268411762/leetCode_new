package com.gdpph.o1kuaixue.demo.chapter13.section4.section1;

import java.text.DateFormat;
import java.util.Date;

/**
 * DateFormat格式化风格
 *
 * @author 零壹学堂
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        Date now = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        System.out.println("(Default)今天日期为：" + dateFormat.format(now));
        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("(SHORT)今天日期为：" + dateFormat.format(now));
        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("(MEDIUM)今天日期为：" + dateFormat.format(now));
         dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
         System.out.println("(LONG)今天日期为：" + dateFormat.format(now));
         dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
         System.out.println("(FULL)今天日期为：" + dateFormat.format(now));
    }
}
