package com.gdpph.o1kuaixue.demo.chapter15.section3.section1;

import java.util.ArrayList;
import java.util.List;

/**
 * NullPointerException
 *
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("第一个元素abc");
        list.add(null);
        for (String var : list) {
            // 读取第二个元素为null时下面调用会出现空指针
            System.out.println(var.toUpperCase());
        }
    }
}
