package com.gdpph.o1kuaixue.demo.chapter14.section2.section3;

import java.io.File;

/**
 * 读取目录下文件和目录
 *
 * @author 零壹学堂
 */
public class ReadDir {
    public static void main(String[] args) {
        String dirName = "java";
        File file = new File(dirName);
        if (file.isDirectory()) {
            System.out.println("访问目录 " + dirName);
            String s[] = file.list();
            for (int i = 0; i < s.length; i++) {
                File tempFile = new File(dirName + "/" + s[i]);
                if (tempFile.isDirectory()) {
                    System.out.println(s[i] + " 是一个目录");
                } else {
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        } else {
            System.out.println(dirName + " 不是一个目录");
        }
    }
}
