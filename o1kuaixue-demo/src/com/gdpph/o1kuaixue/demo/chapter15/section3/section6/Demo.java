package com.gdpph.o1kuaixue.demo.chapter15.section3.section6;

/**
 * ClassCastException异常
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        Parent parent = new Parent();
		Child child = (Child) parent; //抛出异常
    }
}
