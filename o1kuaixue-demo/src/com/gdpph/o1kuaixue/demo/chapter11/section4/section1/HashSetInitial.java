package com.gdpph.o1kuaixue.demo.chapter11.section4.section1;

import java.util.*;

/**
 * HashSet初始化
 * @author 零壹学堂
 */
public class HashSetInitial {
    public static <E> void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        Set<E> hashSet2 = new HashSet<>();
        Set<E> hashSetWithCapacity = new HashSet<>(10);
    }
}
