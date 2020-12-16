package com.gdpph.o1kuaixue.demo.chapter14.section8.section3;

import java.io.*;
import java.util.zip.*;
/**
 * 压缩和解压数据
 * @author 零壹学堂
 */
public class ZipDemo {
    public static void main(String[] args) throws IOException {
        // 测试字符串
        String str = "%3A39%3A41%22%5B%22JavaProgram%22%3A%222018-08-08+9%7B%2C%22smsList%22%3A%5B%7B%22liveState%22%3A%221";
        System.out.println("待压缩字符串为：" + str);
        System.out.println("待压缩字符串长度为：" + str.length());
        System.out.println("压缩后内容为：" + compress(str));
        System.out.println("压缩后内容的长度为：" + compress(str).length());
        System.out.println("解压缩后内容为：" + uncompress(compress(str)));
    }
    // 压缩数据
    public static String compress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gzipOutputStream.write(str.getBytes());
        gzipOutputStream.close();
        return byteArrayOutputStream.toString("ISO-8859-1");
    }
    // 解压缩数据
    public static String uncompress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
        GZIPInputStream gzipInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] buffer = new byte[256];
        int n;
        while ((n = gzipInputStream.read(buffer)) >= 0) {
            byteArrayOutputStream.write(buffer, 0, n);
        }
        return byteArrayOutputStream.toString();
    }
}
