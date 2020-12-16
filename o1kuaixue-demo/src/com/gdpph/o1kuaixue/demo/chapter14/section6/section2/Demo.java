package com.gdpph.o1kuaixue.demo.chapter14.section6.section2;

import java.io.*;
/**
 * 反序列化示例
 *
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String [] args)
    {
       Cat cat = null;
       try
       {
          FileInputStream fileIn = new FileInputStream("cat.ser");
          ObjectInputStream in = new ObjectInputStream(fileIn);
          cat = (Cat) in.readObject();
          in.close();
          fileIn.close();
       }catch(IOException e)
       {
          e.printStackTrace();
          return;
       }catch(ClassNotFoundException e)
       {
          System.out.println("无法找到Cat类");
          e.printStackTrace();
          return;
       }
       System.out.println("反序列化Cat对象...");
       System.out.println("cat.name: " + cat.name);
       System.out.println("cat.age: " + cat.age);
       System.out.println("cat.desc: " + cat.desc);
     }
}
