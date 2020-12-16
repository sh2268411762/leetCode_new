package com.gdpph.o1kuaixue.demo.chapter10.section1.section12;

/**
 * Character类中的常量
 * @author 零壹学堂
 */
public class CharacterConstant {
    public static void main(String[] args) {
        char maxChar = Character.MAX_VALUE;
        char minChar = Character.MIN_VALUE;
        int size = Character.SIZE;
        Class classType = Character.TYPE;
        System.out.println("char最大值:" + maxChar);
        System.out.println("char最小值:" + minChar);
        System.out.println("char二进制位数:" + size);
        System.out.println("对应char类型的Class对象" + classType);
    }
}
