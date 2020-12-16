package com.gdpph.o1kuaixue.demo.chapter14.section4.section1;

import java.io.*;

/**
 * BufferedInputStream示例
 *
 * @author 零壹学堂
 */
public class BufferedDemo {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("data.txt");
            BufferedInputStream bufferInput = new BufferedInputStream(input);
            String content = null;
            // 定义一个缓冲区
            byte[] buffer = new byte[1024];
            int flag = 1;
            while ((flag = bufferInput.read(buffer)) != -1) {
                content += new String(buffer, 0, flag);
            }
            System.out.println("输出缓存内容为：");
            System.out.println(content);
            bufferInput.close(); // 关闭流
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
