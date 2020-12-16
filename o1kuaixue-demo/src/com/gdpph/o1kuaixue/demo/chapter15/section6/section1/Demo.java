package com.gdpph.o1kuaixue.demo.chapter15.section6.section1;

/**
 * 不要在finally块中处理返回值
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
       System.out.println("count方法返回值为：" + count());;
    }
    public static int count() {
        try {
            return 1;
        } catch (Exception e) {
        } finally {
            return -1;
        }
    }
}
