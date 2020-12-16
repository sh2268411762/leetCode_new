package com.gdpph.o1kuaixue.demo.chapter14.section4.section2;

import java.io.*;

/**
 * BufferedOutputStream类示例
 *
 * @author 零壹学堂
 */
public class BufferedExample {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("data.txt");
            BufferedOutputStream bos = new BufferedOutputStream(output);
            String content = "缓冲输出流测试数据1234567890";
            bos.write(content.getBytes(), 0, content.getBytes().length);
            bos.flush();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
