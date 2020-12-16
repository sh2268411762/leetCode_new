package com.gdpph.o1kuaixue.demo.chapter14.section4.section4;

import java.io.*;

/**
 * BufferedReader类
 *
 * @author 零壹学堂
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // 创建一个字符读取流对象和文件相关联。
            FileReader fileReader = new FileReader("data.txt");
            reader = new BufferedReader(fileReader); // 缓存类BufferedReader类构造方法
            String line;
            try {
                int i = 1;
                while ((line = reader.readLine()) != null) {
                    System.out.println("读取文件第" + i + "行数据为" + line);
                    i++;
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
