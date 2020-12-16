package com.gdpph.o1kuaixue.demo.chapter19.section3.section1;

import java.util.Base64;
/**
 * base64加密
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        try {
            final Base64.Decoder decoder = Base64.getDecoder();
            final Base64.Encoder encoder = Base64.getEncoder();
            final String text = "零基础Java从入门到精通";
            final byte[] textByte = text.getBytes("UTF-8");
            final String encodedText = encoder.encodeToString(textByte);
            System.out.println("base64开始加密：" + text);
            System.out.println(encodedText);
            System.out.println("base64开始解密：");
            System.out.println(new String(decoder.decode(encodedText), "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
