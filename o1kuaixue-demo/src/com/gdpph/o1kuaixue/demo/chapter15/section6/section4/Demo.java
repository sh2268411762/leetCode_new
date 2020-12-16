package com.gdpph.o1kuaixue.demo.chapter15.section6.section4;

import java.io.FileInputStream;
import java.io.InputStream;
/**
 * 使用Exception捕获所有异常
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("无效文件.json");
        } catch (Exception e) {
            System.out.println("使用Exception捕获所有异常：");
            e.printStackTrace();
        }
    }
}
