package Bit_topicEveryday._11_26;

import java.util.*;


public class Main {
    static int count = 0;   //有多少种
    static int[] arr;       //神奇的口袋
    static int n;           //物品的种类

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n + 1];
//      这里的大小我们设置的比物品的种类要大1，因为在下边进行递归的时候，
//      如果大小为n,因为在放第一个的时候还要考虑第一个的前一个
//      数组大小为n的话会造成数组溢出


        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();   //输入an
        }
        count(40, n);
        System.out.println(count);
    }

    public static void count(int s, int n) {
        //s表示背包剩下的容量大小
        //n表示剩下的东西数量
        //如果背包容量刚好等于零，说明刚好装满
        if (s == 0) {
            count++;
        }
        //背包容量小于零（装不下了）或者 容量大于零但是东西数量小于零，则不能刚好装满（不够装了）
        if (s <= 0 || (s > 0 && n < 0)) {
            return;
        }
        count(s - arr[n], n - 1);        //从最后一个开始装
        count(s, n - 1);        //如果最后一个和其他是都值完了，从倒数第二个开始
    }
}
