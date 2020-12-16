package com.gdpph.o1kuaixue.demo.chapter11.section3.section1;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList类初始化
 * @author 零壹学堂
 */
public class ArrayListInitial {
    public static <E> void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        List<String> arrayListWithCapacity = new ArrayList<>(10);
        List<E> list = new ArrayList<>();
    }
}
