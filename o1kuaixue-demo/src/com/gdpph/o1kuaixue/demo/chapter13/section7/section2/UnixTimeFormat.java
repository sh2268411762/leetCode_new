package com.gdpph.o1kuaixue.demo.chapter13.section7.section2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 * 获取当前时间戳
 * @author 零壹学堂
 */
public class UnixTimeFormat {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
		//精确时间到毫秒，除以1000，精确到秒
        String nowUnixTimeStamp = String.valueOf(time / 1000);
        System.out.println("当前操作系统的时间戳为：" + nowUnixTimeStamp);
		//将UnixTime转换为普通日期格式
		String formats = "yyyy-MM-dd HH:mm:ss";
		String date = new SimpleDateFormat(formats, Locale.CHINA).format(new Date(time));
		System.out.println("当前操作系统的时间为：" + date);
    }
}
