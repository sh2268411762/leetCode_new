package Bit_topicEveryday._02_01;

import java.util.Scanner;

public class Main
{
    public static final int[] W = {17 * 29, 29, 1};

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //输入并用 . 分割
        String[] p = sc.next().split("\\.");
        String[] a = sc.next().split("\\.");
        //parseInt(String s)
        //将字符串参数解析为带符号的十进制整数
        int[] P = {Integer.parseInt(p[0]), Integer.parseInt(p[1]), Integer.parseInt(p[2])};
        int[] A = {Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2])};
        int t1 = A[0] * W[0] + A[1] * W[1] + A[2] * W[2];
        int t2 = P[0] * W[0] + P[1] * W[1] + P[2] * W[2];
        int t = t1 - t2;
        if (t1 < t2)
        {
            System.out.print("-");
            t = -t;
        }
        System.out.println(t / W[0] + "." + t % W[0] / W[1] + "." + t % W[0] % W[1] / W[2]);
    }
}
