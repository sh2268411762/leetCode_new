package com.gdpph.o1kuaixue.demo.chapter15.section3.section2;

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
            if (var == null) {
                System.out.println("判断该元素为空");
                continue;
            }
            System.out.println(var.toUpperCase());
        }
    }
}
