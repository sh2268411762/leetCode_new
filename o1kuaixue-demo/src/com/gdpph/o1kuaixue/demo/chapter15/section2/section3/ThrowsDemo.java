package com.gdpph.o1kuaixue.demo.chapter15.section2.section3;

/**
 * throws定义方法异常
 * @author 零壹学堂
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            secondException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void firstException() throws Exception {
        throw new IllegalArgumentException("方法内抛出异常");
    }
    public static void secondException() throws Exception {
        firstException();
    }
}
