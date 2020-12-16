package com.gdpph.o1kuaixue.demo.chapter14.section1.section1;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * InputStream类
 *
 * @author 零壹学堂
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("Data.json");
            System.out.println("创建输入流：" + inputStream.toString());
            System.out.println("输入流读取字符：" + inputStream.read());
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
