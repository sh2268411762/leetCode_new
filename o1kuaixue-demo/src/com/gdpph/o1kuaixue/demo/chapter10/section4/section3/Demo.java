package com.gdpph.o1kuaixue.demo.chapter10.section4.section3;

/**
 * 泛型类使用示例
 *
 * @author 零壹学堂
 */
public class Demo {
    // 比较2个值并返回最大值
    public static <T extends Comparable<T>> T max(T x, T y) {
        T max = x; // 假设x是初始最大值
        if (y.compareTo(max) > 0) {
            max = y; // y 更大
        }
        return max; // 返回最大对象
    }
    public static void main(String args[]) {
        System.out.printf("%d 和 %d 中最大的数为 %d\n\n", 10, 11, max(10, 11));
        System.out.printf("%.1f 和 %.1f 中最大的数为 %.1f\n\n", 1.3, 1.4, max(1.3, 1.4));
        System.out.printf("%s 和 %s 中最大的数为 %s\n", "red", "blue", max("red", "blue"));
    }

}
