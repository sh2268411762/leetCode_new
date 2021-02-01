package Bit_topicEveryday._01_28;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext())    //控制循环输入
        {
            int n = sc.nextInt();
            //无人获奖即每个人抽到的都不是自己名字
            float ret = (count(n) / fun(n)) * 100;
            System.out.println(String.format("%.2f", ret) + "%");
        }
    }

    private static float fun(int n) //求阶乘
    {
        if (n == 0)
        {
            return 1;
        }
        return n * fun(n - 1);
    }

    private static float count(int n)   //拿不到自己名字的概率
    {
        if (n == 1)
        {
            return 0;
        }
        if (n == 2)
        {
            return 1;
        }

        return (n - 1) * (count(n - 1) + count(n - 2));
    }
}
