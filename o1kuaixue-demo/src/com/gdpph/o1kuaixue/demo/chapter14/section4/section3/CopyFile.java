package com.gdpph.o1kuaixue.demo.chapter14.section4.section3;

import java.io.*;

/**
 * 缓存输入输出流复制文件
 *
 * @author 零壹学堂
 */
public class CopyFile {
    public static void main(String[] args) {
        try {
            long beginTime = System.currentTimeMillis();
            FileInputStream fileInput = new FileInputStream("data.txt");
            BufferedInputStream input = new BufferedInputStream(fileInput);
            FileOutputStream fileOutput = new FileOutputStream("copyData.txt");
            BufferedOutputStream output = new BufferedOutputStream(fileOutput);
            int size = 0;
            byte[] buffer = new byte[10240];
            // 将文件写入缓存输入流
            while ((size = input.read(buffer)) != -1) {
                output.write(buffer, 0, size); // 将缓存输入流中的数据通过缓存输出流写入目标文件
            }
            // 刷新缓存的输出流，保证数据全部都能写出
            output.flush();
            input.close(); // 关闭输入流
            output.close();// 关闭输出流
            System.out.println("复制文件完毕——耗时：" + (System.currentTimeMillis() - beginTime) + "毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
