package com.gdpph.o1kuaixue.demo.chapter15.section6.section3;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
/**
 * 开发封装业务自己的异常
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) throws JavaBizException{
        try {
            InputStream input = new FileInputStream("无效文件.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new JavaBizException(e.getMessage());
        }
    }
}
