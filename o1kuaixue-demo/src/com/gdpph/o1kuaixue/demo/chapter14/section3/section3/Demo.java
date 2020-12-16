package com.gdpph.o1kuaixue.demo.chapter14.section3.section3;

import java.io.*;

/**
 * FileWrite类写入文件
 *
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        try {
            String fileName = "data.txt";
            writeFile(fileName);
            readFile(fileName);
        } catch (Exception e) {
            System.out.println("系统异常"+e.getMessage());
        }
    }
    // 读取文件
    private static void readFile(String fileName) throws IOException, FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
            char ch = ' ';
            System.out.println("读取文件中字符：");
            while (ch != '9') {
                ch = (char) fileReader.read();
                System.out.print(ch);
            }
            System.out.println("==文件读取完成==");
            fileReader.close();
    }
    // 写入文件
    private static void writeFile(String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        System.out.println("开始写入文件：");
        // 依次写入文件
        for(int i = 0;i < 10;i++){
            fileWriter.write(String.valueOf(i));
        }
        fileWriter.close();
    }
}
