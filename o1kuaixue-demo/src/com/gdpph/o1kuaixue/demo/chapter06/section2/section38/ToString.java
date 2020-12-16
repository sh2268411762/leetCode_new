package com.gdpph.o1kuaixue.demo.chapter06.section2.section38;

import java.util.ArrayList;
import java.util.List;

/**
 * toString()方法
 *
 * @author 零壹学堂
 */
public class ToString {
    public static void main(String[] args) {
        String str = "零壹学堂";
        System.out.println("转为字符串：" + str.toString());
        List<String> strList = new ArrayList<>();
        strList.add("我");
        strList.add("爱");
        strList.add("编程");
        System.out.println("集合类转为字符串：" + strList.toString());
    }
}
