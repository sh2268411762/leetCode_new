package com.gdpph.o1kuaixue.demo.chapter09.section5.section6;

/**
 * Cat类
 *
 * @author 零壹学堂
 */
public class Cat implements Cloneable {
    private String name;
    private int age;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Cat：【姓名=" + name + ",年龄=" + age + "】";
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}




