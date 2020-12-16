package com.gdpph.o1kuaixue.demo.chapter03.section6.section3;

/**
 * 赋值运算符使用
 * @author 零壹学堂
 */
public class EvaluateOperation {
    public static void main(String[] args) {
        int a = 1010;
        int b = 33;
        int c = a + b;
        System.out.println("赋值运算符c = a + b结果为" + c);
        c += a;
        System.out.println("赋值运算符c += a结果为" + c);
        c -= a;
        System.out.println("赋值运算符c -= a结果为" + c);
        c *= a;
        System.out.println("赋值运算符c *= a结果为" + c);
        c /= a;
        System.out.println("赋值运算符c /= a结果为" + c);
        c %= a;
        System.out.println("赋值运算符c %= a结果为" + c);
        c <<= 2;
        System.out.println("赋值运算符c <<= 2结果为" + c);
        c >>= 2;
        System.out.println("赋值运算符c >>= 2结果为" + c);
        c >>= 2;
        System.out.println("赋值运算符c >>= a结果为" + c);
        c &= a;
        System.out.println("赋值运算符c &= 2结果为" + c);
        c ^= a;
        System.out.println("赋值运算符c ^= a结果为" + c);
        c |= a;
        System.out.println("赋值运算符c |= a结果为" + c);
    }

}
