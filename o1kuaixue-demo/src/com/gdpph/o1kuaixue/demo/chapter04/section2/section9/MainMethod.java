package com.gdpph.o1kuaixue.demo.chapter04.section2.section9;

/**
 * 命令行入参
 * @author 零壹学堂
 */
public class MainMethod {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("命令行入参args[" + i + "]为: " + args[i]);
        }
    }
}
