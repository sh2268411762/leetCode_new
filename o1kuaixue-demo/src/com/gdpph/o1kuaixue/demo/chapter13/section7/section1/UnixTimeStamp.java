package com.gdpph.o1kuaixue.demo.chapter13.section7.section1;

/**
 * 获取当前时间戳
 * @author 零壹学堂
 */
public class UnixTimeStamp {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
		//精确时间到毫秒，除以1000，精确到秒
        String nowUnixTimeStamp = String.valueOf(time / 1000);
        System.out.println("当前操作系统的时间戳为：" + nowUnixTimeStamp);
    }
}
