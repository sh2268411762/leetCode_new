package com.gdpph.o1kuaixue.demo.chapter10.section2.section7;

import java.util.Random;

/**
 * Random类使用方法
 *
 * @author 零壹学堂
 */
public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("返回一个随机整数：" + random.nextInt());
        System.out.println("返回一个大于等于0小于10的随机整数" + random.nextInt(10));
        System.out.println("返回一个随机布尔值：" + random.nextBoolean());
        System.out.println("返回一个高斯分布双精度值：" + random.nextGaussian());
    }
}
