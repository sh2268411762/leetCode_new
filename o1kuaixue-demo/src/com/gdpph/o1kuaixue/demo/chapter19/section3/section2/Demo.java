package com.gdpph.o1kuaixue.demo.chapter19.section3.section2;

import java.io.FileInputStream;
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
            FileInputStream input = new FileInputStream("data.txt");
            byte[] buffer = new byte[1024];
            String str = "";
            while (true) {
                int len = input.read(buffer);
                if (len == -1) {
                    break;
                }
                str = new String(buffer, 0, len);
                System.out.println(str);
            }
            final byte[] textByte = str.getBytes("UTF-8");
            final String encodedText = encoder.encodeToString(textByte);
            System.out.println("base64开始加密：");
            System.out.println(encodedText);
            System.out.println("base64开始解密：");
            System.out.println(new String(decoder.decode(encodedText), "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
