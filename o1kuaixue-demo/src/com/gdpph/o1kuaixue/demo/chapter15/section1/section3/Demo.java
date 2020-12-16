package com.gdpph.o1kuaixue.demo.chapter15.section1.section3;

import java.io.*;
/**
 * 运行时异常示例
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String args[]) {
            int a[] = new int[2];
            System.out.println("访问数组中索引为3的元素 :" + a[3]); // 抛出异常
    }
}
