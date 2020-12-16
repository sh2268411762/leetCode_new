package com.gdpph.o1kuaixue.demo.chapter14.section3.section2;

import java.io.FileReader;

/**
 * FileReader类读取文件
 *
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("data.json");
            char ch = ' ';
            System.out.println("读取文件中字符：");
            while (ch != '}') {
                ch = (char) fileReader.read();
                System.out.print(ch);
            }
            System.out.println("==文件读取完成==");
            fileReader.close();
        } catch (Exception e) {
            System.out.println("系统异常"+e.getMessage());
        }
    }
}
