package com.gdpph.o1kuaixue.demo.chapter12.section1.section7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 零壹学堂
 */
public class Test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        PrintUtil printUtil = new PrintUtil();
        Class clazz = printUtil.getClass();
        try {
            // getMethod获取方法
            Method m1 = clazz.getMethod("print", int.class, int.class);
            // 使用invoke调用方法
            m1.invoke(printUtil, 1, 2);

            Method m2 = clazz.getMethod("print", String.class, String.class);
            m2.invoke(printUtil, "hello", "world");

            Method m3 = clazz.getMethod("print");
            m3.invoke(printUtil);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

class PrintUtil {
    public void print(int a, int b) {
        System.out.println("相加的结果为：" + a + b);
    }

    public void print(String a, String b) {
        System.out.println("转换为大写字母的结果为：" + a.toUpperCase() + " " + b.toUpperCase());
    }

    public void print() {
        System.out.println("Hello world!");
    }
}
