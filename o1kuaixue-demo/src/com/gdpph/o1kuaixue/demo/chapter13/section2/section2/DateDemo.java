package com.gdpph.o1kuaixue.demo.chapter13.section2.section2;

import java.util.Date;

/**
 * Date类常用方法
 *
 * @author 零壹学堂
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("创建一个Date对象为：" + date1.toString());
        System.out.println("返回Date对象内容毫秒级格式：" + date1.getTime());
        Date date2 = new Date(date1.getTime() - 1000);
        System.out.println(date1.toString() + "是否在" + date2.toString() + "之前：" + date1.before(date2));
    }
}
