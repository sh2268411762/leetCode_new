package com.gdpph.o1kuaixue.demo.chapter14.section1.section4;

import java.io.*;
/**
 * Writer类
 * @author 零壹学堂
 */
public class WriterDemo {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("Data.json");
            Writer writer = new FileWriter("output.json");
            int i = 0;
            while (i != -1) {
                i = reader.read();
                writer.write(i);
            }
            reader.close();// 关闭输入流
            writer.close();// 关闭输出流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
