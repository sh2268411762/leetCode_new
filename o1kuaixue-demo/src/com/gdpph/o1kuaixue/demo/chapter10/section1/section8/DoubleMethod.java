package com.gdpph.o1kuaixue.demo.chapter10.section1.section8;

/**
 * Double类中常见方法
 * @author 零壹学堂
 */
public class DoubleMethod {
    public static void main(String[] args) {
        String str = new Double(10.01).toString(); //返回字符串为"10.01"的String对象
        Double d1 = Double.parseDouble(str); //返回10.01的Double对象
        Double d2 = Double.valueOf("11.11"); //返回字符串为"11.11"的Integer对象
        int compareResult = Double.compare(d1, d2); //10.01<11.11，返回-1
        System.out.println("String对象:" + str);
        System.out.println("返回10.01的Double对象:" + d1);
        System.out.println("返回字符串为1的Double对象:" + d2);
        System.out.println("d1和d2的比较结果:" + compareResult);
    }
}
