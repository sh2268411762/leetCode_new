package com.gdpph.o1kuaixue.demo.chapter09.section6.section2;

/**
 * 抽象类示例
 * @author 零壹学堂
 */
public class ShowAnimal {
    public static void main(String[] args) {
        AbstractAnimal cat = new Cat();
        cat.name = "猫";
        cat.getDesc();
        cat.eat();
        AbstractAnimal dog = new Dog();
        dog.name = "狗";
        dog.getDesc();
        dog.eat();
    }
}
