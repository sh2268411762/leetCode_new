package com.gdpph.o1kuaixue.demo.chapter13.section4.section2;

import java.text.DateFormat;
import java.util.Date;

/**
 * DateFormat类parse()方法
 *
 * @author 零壹学堂
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateInstance();
        try {
            Date date = dateFormat.parse("2018-07-25");
            System.out.println("将字符串转为Date对象为：" + date.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
