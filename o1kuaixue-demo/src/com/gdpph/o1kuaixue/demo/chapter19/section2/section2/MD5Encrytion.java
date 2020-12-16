package com.gdpph.o1kuaixue.demo.chapter19.section2.section2;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * MD5加密
 * @author 零壹学堂
 */
public class MD5Encrytion {
    public static void main(String[] args) {
        String userAPassword = "0123456789";
        String userBPassword = "95643210";
        System.out.println("用户A登录是否成功：" + md5Encryp(userAPassword).equals(getPasswordFromDB("userA")));
        System.out.println("用户B登录是否成功：" + md5Encryp(userBPassword).equals(getPasswordFromDB("userB")));
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
    // 模拟从数据库获取用户存储的密码
    public static String getPasswordFromDB(String name) {
        return UserEnum.getPassword(name);
    }
}
