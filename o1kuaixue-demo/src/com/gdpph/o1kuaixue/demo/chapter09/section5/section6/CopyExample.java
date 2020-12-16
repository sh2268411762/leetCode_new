package com.gdpph.o1kuaixue.demo.chapter09.section5.section6;

/**
 * 浅复制-基础类型
 *
 * @author 零壹学堂
 */
public class CopyExample {
    public static void main(String[] args) {
        try {
            Cat catA = new Cat();
            catA.setName("大花");
            catA.setAge(3);
            System.out.println("catA为" + catA);
            Cat catB = (Cat) catA.clone();
            System.out.println("复制后catB为" + catB);
            catB.setName("小黑");
            catB.setAge(4);
            System.out.println("修改后catB为" + catB);
            System.out.println("修改后catA为" + catA);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
