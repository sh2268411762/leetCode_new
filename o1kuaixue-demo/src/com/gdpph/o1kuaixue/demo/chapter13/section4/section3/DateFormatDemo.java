package com.gdpph.o1kuaixue.demo.chapter13.section4.section3;

import java.text.DateFormat;
import java.util.Date;

/**
 * DateFormat类format()方法
 *
 * @author 零壹学堂
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateInstance();
        try {
            Date date = new Date();
            System.out.println("将Date对象转为字符串为：" + dateFormat.format(date));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
