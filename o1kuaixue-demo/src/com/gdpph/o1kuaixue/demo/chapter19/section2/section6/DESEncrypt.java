package com.gdpph.o1kuaixue.demo.chapter19.section2.section6;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import java.math.BigInteger;
/**
 * DES加密算法
 * @author 零壹学堂
 */
public class DESEncrypt {
    public static void main(String[] args) {
        String data = "零基础Java从入门到精通";// 待加密数据
        String key = "12345678";// 初始化密钥，必须为8的倍数长度
        // 加密
        byte[] encryptData = encryptOrDecrypt(key, data.getBytes(), Cipher.ENCRYPT_MODE);
        System.out.println("按位打印加密后的密文为：");
        for (byte i : encryptData) {
            System.out.print(i + " ");
        }
        System.out.println(data + " 加密后的数据为：" + new BigInteger(1, encryptData).toString(512));
        // 解密
        byte[] decryptData = encryptOrDecrypt(key, encryptData, Cipher.DECRYPT_MODE);
        System.out.println(new String(encryptData) + " 解密后的数据为：" + new String(decryptData));
    }
    /**
     * DES加密/解密算法
     *
     * @param key  用于生成DES密钥的密码，会取key的前8位来生成密钥
     * @param data 数据原文/密文-待加密的数据/待解密的数据
     * @param mode 加密or解密
     * @return 返回加密/解密后的数据
     */
    private static byte[] encryptOrDecrypt(String key, byte[] data, int mode) {
        try {
            // 系统随机生成一个可信任的随机源
            SecureRandom secureRandom = new SecureRandom();
            // 创建一个DESKeySpec对象来持有密钥
            DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());
            // 创建密钥工厂
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            // DES加密/解密中实际使用的密钥
            SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
            // 创建一个用于DES加密/解密的Cipher对象
            Cipher cipher = Cipher.getInstance("DES");
            // 使用key、data和mode三个参数来初始化cipher
            cipher.init(mode, secretKey, secureRandom);
            return cipher.doFinal(data);
        } catch (Exception e) {
            System.out.println("DES算法发生异常，异常内容为：" + e.getMessage());
            return "系统异常".getBytes();
        }
    }
}
