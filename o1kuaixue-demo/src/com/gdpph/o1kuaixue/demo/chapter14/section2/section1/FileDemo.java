package com.gdpph.o1kuaixue.demo.chapter14.section2.section1;

import java.io.*;

/**
 * File类
 *
 * @author 零壹学堂
 */
public class FileDemo {
    public static void main(String[] args) {
        try {
            File file = new File("Data.json");
            System.out.println("创建文件Data.json");
            System.out.println("是否创建成功：" + file.createNewFile());
            System.out.println("文件名是否为绝对路径：" + file.isAbsolute());
            System.out.println("文件是否可读：" + file.canRead());
            System.out.println("修改文件名称为output.json，是否成功："+file.renameTo(new File("output.json")));
        } catch (Exception e) {
            System.out.println("系统发生异常：" + e.getMessage());
        }
    }
}
