package com.gdpph.o1kuaixue.demo.chapter10.section2.section2;

import java.lang.Math;
/**
 * Math类中取整方法
 * @author 零壹学堂
 */
public class RoundingMethod {
    public static void main(String[] args) {
        System.out.println("舍掉小数取整:Math.floor(3.14)=" + Math.floor(3.14));
        System.out.println("四舍五入取整:Math.rint(-2.5)=" + Math.rint(-2.5));
        System.out.println("凑整:Math.ceil(3.14)=" + Math.ceil(3.14));
        System.out.println("四舍五入取整:Math.round(1.805)=" + Math.round(1.805));
    }
}
