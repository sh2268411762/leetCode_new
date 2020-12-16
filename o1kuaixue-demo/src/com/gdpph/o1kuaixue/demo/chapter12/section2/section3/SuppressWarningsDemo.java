package com.gdpph.o1kuaixue.demo.chapter12.section2.section3;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsDemo {
    /**
     * 抑制单个类型的警告
     */
    @SuppressWarnings("unchecked")
    public void test1(int index) {
        @SuppressWarnings("unused")
        List<Integer> list = new ArrayList<>();
        list.add(index);
    }

    /**
     * 抑制多个类型的警告
     */
    @SuppressWarnings({"unchecked", "unused"})
    public void test2(int index) {
        List<Integer> list = new ArrayList<>();
        list.add(index);
    }

    /**
     * 抑制所有类型的警告
     */
    @SuppressWarnings("all")
    public void test3(int index) {
        List<Integer> list = new ArrayList<>();
        list.add(index);
    }
}
