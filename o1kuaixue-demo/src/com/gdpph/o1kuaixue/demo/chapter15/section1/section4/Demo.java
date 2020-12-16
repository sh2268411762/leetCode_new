package com.gdpph.o1kuaixue.demo.chapter15.section1.section4;

/**
 * 非运行时异常
 *
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        try {
			Class.forName("className");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
