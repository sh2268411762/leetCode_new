package com.gdpph.o1kuaixue.demo.chapter15.section6.section2;

/**
 * 不要在finally块中处理返回值
 * @author 零壹学堂
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("方法返回Person对象名称为：" + getPerson().name);
    }
    public static Person getPerson() {
        Person person = new Person();
        person.name = "王老师";
        try {
            return person;
        } catch (Exception e) {
        } finally {
            person.name = "王学生";
        }
        person.name = "刘老师";
        return person;
    }
}
