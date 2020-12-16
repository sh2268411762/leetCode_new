package com.gdpph.o1kuaixue.demo.chapter09.section5.section7;

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
            CatAction catActionA = new CatAction();
            catActionA.setEat("吃猫粮");
            catA.setCatAction(catActionA);
            System.out.println("catA为" + catA);
            Cat catB = (Cat) catA.clone();
            System.out.println("复制后catB为" + catB);
            catB.setName("小黑");
            catB.setAge(4);
            CatAction catActionB = catB.getCatAction();
            catActionB.setEat("玩球球");
            catB.setCatAction(catActionB);
            System.out.println("修改后catB为" + catB);
            System.out.println("修改后catA为" + catA);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
