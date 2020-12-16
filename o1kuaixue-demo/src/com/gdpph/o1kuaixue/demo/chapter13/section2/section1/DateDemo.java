package com.gdpph.o1kuaixue.demo.chapter13.section2.section1;

import java.util.Date;

/**
 * Date类初始化
 *
 * @author 零壹学堂
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("直接创建一个Date对象为：" + date1.toString());
        Date date2 = new Date(System.currentTimeMillis());
        System.out.println("获取系统当前时间创建Date对象为：" + date2.toString());
    }
}
