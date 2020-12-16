package com.gdpph.o1kuaixue.demo.chapter12.section2.section2;

public class Cat {
    /**
     * @deprecated注解表明该方法已经过期，不再推荐使用
     */
    @Deprecated
    public void swim(){
        System.out.println("猫正在游泳");
    }

    public void run() {
        System.out.println("猫正在跑");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.swim();
        cat.run();
    }
}
