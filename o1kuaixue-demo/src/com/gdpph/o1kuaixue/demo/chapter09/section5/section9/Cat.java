package com.gdpph.o1kuaixue.demo.chapter09.section5.section9;

import java.io.*;
/**
 * Cat类
 *
 * @author 零壹学堂
 */
public class Cat implements Serializable {
    private String name;
    private int age;
    private CatAction catAction;
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
    /**
     * @return the catAction
     */
    public CatAction getCatAction() {
        return catAction;
    }
    /**
     * @param catAction the catAction to set
     */
    public void setCatAction(CatAction catAction) {
        this.catAction = catAction;
    }
    @Override
    public String toString() {
        return "Cat：【姓名="+name+",年龄="+age+"】 "+catAction.toString();
    }
    public Object deepClone() throws Exception
    {
        // 序列化
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        // 反序列化
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        return new ObjectInputStream(byteArrayInputStream).readObject();
    }
}
