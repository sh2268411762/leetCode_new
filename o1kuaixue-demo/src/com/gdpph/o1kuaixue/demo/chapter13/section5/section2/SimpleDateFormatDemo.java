package com.gdpph.o1kuaixue.demo.chapter13.section5.section2;

import java.text.ParseException;
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
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2018-11-12";
        long time = 0L;
        try {
            time = format.parse(str).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(str + "转化为毫秒数为：" + time);
        format = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
        System.out.println(time + "毫秒格式化为时间为：" + format.format(time));
    }
}
