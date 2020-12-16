package com.gdpph.o1kuaixue.demo.chapter14.section1.section5;

import java.io.*;

/**
 * 系统预定义流
 *
 * @author 零壹学堂
 */
public class SystemIO {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入字符串，按回车结束：");
            System.out.println("输入内容为：" + reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
