package com.gdpph.o1kuaixue.demo.chapter09.section6.section5;

/**
 * AnimalService接口实现类
 * @author 零壹学堂
 */
public class AnimalServiceImpl implements AnimalService {
    @Override
    public void sleep() {
        System.out.println("实现动物接口");
    }

    public static void main(String[] args) {
        AnimalService animalService = new AnimalServiceImpl();
        animalService.sleep();
    }
}
