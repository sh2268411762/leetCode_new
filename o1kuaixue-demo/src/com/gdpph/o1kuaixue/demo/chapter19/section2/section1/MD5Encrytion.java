package com.gdpph.o1kuaixue.demo.chapter19.section2.section1;

import java.math.BigInteger;
import java.security.MessageDigest;
/**
 * MD5加密
 * @author 零壹学堂
 */
public class MD5Encrytion {
    public static void main(String[] args) {
        String str = "零基础Java从入门到精通";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5"); //创建MD5加密摘要
            md.update(str.getBytes());
            System.out.println(str +"MD5加密后内容为：");
            System.out.println(new BigInteger(1, md.digest()).toString(16));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
