package com.gdpph.o1kuaixue.demo.chapter14.section1.section3;

import java.io.*;

/**
 * OuputStream类
 *
 * @author 零壹学堂
 */
public class OuputStreamDemo {
    public static void main(String[] args) {
        try {
            File inputFile = new File("Data.json");
            File outputFile = new File("output.json");
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
            int i = 0;
            while (i != -1) {
                i = inputStream.read();
                outputStream.write(i);
            }
            inputStream.close();// 关闭输入流
            outputStream.close();// 关闭输出流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
