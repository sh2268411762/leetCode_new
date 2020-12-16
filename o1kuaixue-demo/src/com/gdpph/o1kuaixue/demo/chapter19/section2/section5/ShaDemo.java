package com.gdpph.o1kuaixue.demo.chapter19.section2.section5;

import java.security.*;
import java.math.BigInteger;
/**
 * SHA-1加密
 * @author 零壹学堂
 */
public class ShaDemo {
    public static void main(String[] args) {
        String str = "零基础Java从入门到精通";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1"); // 创建MD5加密摘要
            md.update(str.getBytes());
            System.out.println(str + "SHA-1加密后内容为：");
            System.out.println(new BigInteger(1, md.digest()).toString(256));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
