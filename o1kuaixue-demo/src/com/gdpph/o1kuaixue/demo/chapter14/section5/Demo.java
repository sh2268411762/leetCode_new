package com.gdpph.o1kuaixue.demo.chapter14.section5;

import java.io.*;

/**
 * DataInputStream类和DataOutputStream类示例
 *
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        testDataOutputStream(); //将数据写入到输出流中
        testDataInputStream(); //使用输入流读取数据
    }
    /**
     * DataOutputStream写入数据
     */
    private static void testDataOutputStream() {
        try {
            File file = new File("data.txt");
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
            System.out.println("开始写入数据：");
            out.writeBoolean(true);
            out.writeByte((byte) 0x11);
            out.writeChar((char) 0x5133);
            out.writeShort((short) 0x4146);
            out.writeInt(0x23456789);
            out.writeLong(0x0FEDCBA123456789L);
            out.writeUTF("零壹学堂");
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * DataInputStream的API测试函数
     */
    private static void testDataInputStream() {
        try {
            File file = new File("data.txt");
            DataInputStream in = new DataInputStream(new FileInputStream(file));
            System.out.println("读取数据：");
            System.out.printf("readShort():0x%s\n", shortToHexString(in.readShort()));
            System.out.printf("readInt():0x%s\n", Integer.toHexString(in.readInt()));
            System.out.printf("readLong():0x%s\n", Long.toHexString(in.readLong()));
            System.out.printf("readBoolean():%s\n", in.readBoolean());
            System.out.printf("byteToHexString(0x8F):0x%s\n", byteToHexString((byte) 0x8F));
            System.out.printf("charToHexString(0x8FCF):0x%s\n", charToHexString((char) 0x8FCF));
            System.out.printf("readByte():0x%s\n", byteToHexString(in.readByte()));
            System.out.printf("readChar():0x%s\n", charToHexString(in.readChar()));
            System.out.printf("readUTF():%s\n", in.readUTF());
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 将byte转换为16进制的字符串
    private static String byteToHexString(byte val) {
        return Integer.toHexString(val & 0xff);
    }
    // 将char转换为16进制的字符串
    private static String charToHexString(char val) {
        return Integer.toHexString(val);
    }
    // 将short转换为16进制的字符串
    private static String shortToHexString(short val) {
        return Integer.toHexString(val & 0xffff);
    }
}
