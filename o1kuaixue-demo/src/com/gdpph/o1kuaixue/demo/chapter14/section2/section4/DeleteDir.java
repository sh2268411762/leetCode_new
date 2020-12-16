package com.gdpph.o1kuaixue.demo.chapter14.section2.section4;

import java.io.File;
/**
 * File类删除操作
 * @author 零壹学堂
 */
public class DeleteDir {
    public static void main(String[] args) {
        File file = new File("java");
        System.out.println("创建文件夹java：" + file.mkdir());
        file = new File("java/dir");
        System.out.println("创建文件夹java/dir：" + file.mkdir());
        File folder = new File("java");
        deleteFolder(folder);
    }
    // 删除文件夹和其中的文件
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f); // 递归调用
                } else {
                    System.out.println("删除文件" + f.getName() + "是否成功：" + f.delete()); // 删除文件
                }
            }
        }
        System.out.println("删除文件" + folder.getName() + "是否成功：" + folder.delete()); // 删除文件夹
    }
}
