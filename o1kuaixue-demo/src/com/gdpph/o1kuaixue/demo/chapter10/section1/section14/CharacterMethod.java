package com.gdpph.o1kuaixue.demo.chapter10.section1.section14;

/**
 * Character类中常见方法
 * @author 零壹学堂
 */
public class CharacterMethod {
    public static void main(String[] args) {
        Character char1 = new Character('c');
        char char2 = Character.toUpperCase(char1);
        System.out.println(char1 + "是大写字母" + Character.isUpperCase(char1));
        System.out.println(char1 + "是小写字母" + Character.isLowerCase(char1));
        System.out.println(char2 + "是大写字母" + Character.isUpperCase(char2));
    }
}
