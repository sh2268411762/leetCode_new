package com.gdpph.o1kuaixue.demo.chapter11.section5.section1;

import java.util.*;

/**
 * Map集合初始化
 * @author 零壹学堂
 */
public class MapInitial {
    public static void main(String[] args) {
        Map<String, String> simpleMap = new HashMap<>();
        Map<String, Map<String, String>> complexMap = new HashMap<>();
        Map<Map<String, String>, String> otherComplexMap = new HashMap<>();
    }
}
