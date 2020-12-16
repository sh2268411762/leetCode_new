package com.gdpph.o1kuaixue.demo.chapter09.section6.section6;

/**
 * Cat类-多重继承两个接口
 * @author 零壹学堂
 */
public class Cat implements CatService, AnimalService {
    @Override
    public void sleep() {
        System.out.println("猫咪睡觉");
    }

    @Override
    public void playBall() {
        System.out.println("猫咪玩球");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sleep();
        cat.playBall();
    }

}
