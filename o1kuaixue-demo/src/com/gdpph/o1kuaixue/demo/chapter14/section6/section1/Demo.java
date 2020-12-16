package com.gdpph.o1kuaixue.demo.chapter14.section6.section1;

import java.io.*;
/**
 * 序列化示例
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "小猫猫";
        cat.age = 3;
        cat.desc = "喵喵喵";
        try {
            FileOutputStream fileOut = new FileOutputStream("cat.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(cat);
            out.close();
            fileOut.close();
            System.out.println("序列化后文件存储在文件：scat.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
