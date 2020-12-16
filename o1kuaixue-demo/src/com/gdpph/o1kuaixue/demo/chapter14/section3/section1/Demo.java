package com.gdpph.o1kuaixue.demo.chapter14.section3.section1;

import java.io.FileOutputStream;
import java.io.*;
/**
 * FileOutputStream类示例
 *
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("data.json");
            FileOutputStream output = new FileOutputStream("output.json");
            byte[] byteArray = new byte[input.available()];
            input.read(byteArray);
            output.write(byteArray);
            input.close();
            output.close();
        } catch (Exception e) {
            System.out.println("系统异常：" + e.getMessage());
        }
    }
}
