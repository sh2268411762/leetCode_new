package com.gdpph.o1kuaixue.demo.chapter14.section1.section2;

import java.io.FileReader;
import java.io.Reader;

/**
 * Reader类
 *
 * @author 零壹学堂
 */
public class ReaderDemo {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("Data.json");
            System.out.println("创建输入流：" + reader.toString());
            System.out.println("读取字符：" + reader.read());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
