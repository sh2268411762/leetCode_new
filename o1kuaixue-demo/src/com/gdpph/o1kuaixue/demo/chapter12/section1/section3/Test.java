package com.gdpph.o1kuaixue.demo.chapter12.section1.section3;

/**
 * @author 零壹学堂
 */
public class Test {
	public static void main(String[] args) {
		//通过 Class类提供的静态方法forName()获取Class对象
      	try {
			Class clazz = Class.forName("com.demo.Student");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

/**
 * 自定义学生类
 */
class Student {
}
