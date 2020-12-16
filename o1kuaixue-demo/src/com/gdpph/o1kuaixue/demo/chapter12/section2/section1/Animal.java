package com.gdpph.o1kuaixue.demo.chapter12.section2.section1;

public abstract class Animal {
    public abstract void printName();
}

class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("动物的名字是：" + name);
    }
}

//class Cat extends Animal {
//    private String name;
//
//    public Cat(String name) {
//        this.name = name;
//    }
//
//    /**
//     * 编译失败，因为printName被错误的写成printname
//     */
//    @Override
//    public void printname() {
//        System.out.println("动物的名字是：" + name);
//    }
//}
