package com.gdpph.o1kuaixue.demo.chapter10.section1.section5;

/**
 * Integer类常用方法
 * @author 零壹学堂
 */
public class IntegerMethod {
    public static void main(String[] args) {
        String str = new Integer(10).toString(); //返回字符串为"10"的String对象
        Integer i1 = Integer.parseInt(str); //返回10的Integer对象
        Integer i2 = Integer.valueOf("1"); //返回字符串为"1"的Integer对象
        int compareResult = Integer.compare(i1, i2); //10>1，返回1
        System.out.println("String对象:" + str);
        System.out.println("返回10的Integer对象:" + i1);
        System.out.println("返回字符串为1的Integer对象:" + i2);
        System.out.println("i1和i2的比较结果:" + compareResult);
    }
}
