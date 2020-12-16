package com.gdpph.o1kuaixue.demo.chapter19.section2.section3;

import java.math.BigInteger;
import java.security.MessageDigest;
/**
 * MD5加密
 * @author 零壹学堂
 */
public class MD5Encrytion {
    public static void main(String[] args) {
        String str = "零基础Java从入门到精通";
        System.out.println("MD5一次加密值为：" + md5Encryp(str));
        System.out.println("MD5二次加密值为：" + md5Encryp(md5Encryp(str)));
    }
    // 将字符串加密md5值
    public static String md5Encryp(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5"); // 创建MD5加密摘要
            md.update(str.getBytes());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
