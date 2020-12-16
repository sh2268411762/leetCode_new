package com.gdpph.o1kuaixue.demo.chapter07.section5.section1;

import org.apache.commons.lang3.ArrayUtils;

/**
 * ArrayUtils使用
 *
 * @author 零壹学堂
 */
public class ArrayUtilsExample {
    public static void main(String[] args) {
        String[] strArrays = { "A", "B" };
        ArrayUtils.add(strArrays, "C");
        System.out.println("添加元素：" + strArrays.toString());
    }
}
