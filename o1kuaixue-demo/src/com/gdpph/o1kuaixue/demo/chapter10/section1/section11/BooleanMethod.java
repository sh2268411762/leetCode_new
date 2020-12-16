package com.gdpph.o1kuaixue.demo.chapter10.section1.section11;

/**
 * Boolean类中常见方法
 * @author 零壹学堂
 */
public class BooleanMethod {
    public static void main(String[] args) {
        String str = new Boolean(true).toString(); //返回字符串为"true"的String对象
        Boolean b1 = Boolean.parseBoolean(str); //返回10.01的Boolean对象
        Boolean b2 = Boolean.valueOf("false"); //返回字符串为"false"的Boolean对象
        int compareResult = Boolean.compare(b1, b2); //true和false比较，返回1
        System.out.println("String对象:" + str);
        System.out.println("返回true的Boolean对象:" + b1);
        System.out.println("返回字符串为false的Boolean对象:" + b2);
        System.out.println("b1和b2的比较结果:" + compareResult);
    }
}
