package com.gdpph.o1kuaixue.demo.chapter19.section2.section7;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
/**
 * AES加密算法
 * @author 零壹学堂
 */
public class AESEncrypt {
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
        System.out.println("解密后的数据为：" + new String(decryptData));
    }
    /**
     * AES加密/解密算法
     *
     * @param key  用于生成AES密钥的密码，会取key的前8位来生成密钥
     * @param data 数据原文/密文-待加密的数据/待解密的数据
     * @param mode 加密or解密
     * @return 返回加密/解密后的数据
     */
    private static byte[] encryptOrDecrypt(String key, byte[] data, int mode) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
            random.setSeed(key.getBytes());
            keyGenerator.init(128, random);
            SecretKey originalKey = keyGenerator.generateKey(); //产生原始对称密钥
            byte[] rawByte = originalKey.getEncoded();
            SecretKey secretKey = new SecretKeySpec(rawByte, "AES");//生成AES密钥
            Cipher cipher = Cipher.getInstance("AES");
            //将加密并编码后的内容解码成字节数组
            cipher.init(mode, secretKey);
            //解密密文
            return cipher.doFinal(data);
        } catch (Exception e) {
            System.out.println("AES算法发生异常，异常内容为：" + e.getMessage());
            return "系统异常".getBytes();
        }
    }
}
