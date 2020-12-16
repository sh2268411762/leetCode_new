package com.gdpph.o1kuaixue.demo.chapter14.section2.section2;

import java.io.File;

/**
 * 创建目录
 *
 * @author 零壹学堂
 */
public class DirDemo {
    public static void main(String[] args) {
        String dirName = "java";
        File file = new File(dirName);
        System.out.println("创建目录java，是否成功：" + file.mkdirs());
    }
}
