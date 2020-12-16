package com.gdpph.o1kuaixue.demo.chapter06.section1.section4;

/**
 * 引用赋值初始化字符串变量
 * @author 零壹学堂
 */
public class InitialString {
    public static void main(String[] args) {
        String str = "零壹学堂"; // 这是引用赋值
        String name = str; // 这也是引用赋值，将str地址赋值给name
        String address1, address2; // 先声明变量类型，然后再引用赋值
        address1 = new String("www.01xuetang.com");
        address2 = new String("www.01xuetang.com");
        System.out.println("address1内容为：" + address1);
        System.out.println("address1内容为：" + address2);
        System.out.println("address1和address2是否相同：" + address1 == address2);
    }
}
