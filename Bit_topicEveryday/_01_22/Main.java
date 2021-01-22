package Bit_topicEveryday._01_22;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) //循环输入
        {
            int n = sc.nextInt();       //怪的数量
            int init = sc.nextInt();    //小易的能力值
            int[] array = new int[n];   //怪的防御力
            for (int i = 0; i < n; i++)
            {
                array[i] = sc.nextInt();
                if (init >= array[i])   //防御力低于小易的能力值，直接加
                {
                    init += array[i];
                } else    //防御力大于等于小易当前能力值，加最大公约数
                {
                    init += greatestDivisorGcd(init, array[i]);
                }
            }
            System.out.println(init);
        }
        sc.close();
    }

    private static int greatestDivisorGcd(int init, int i)
    {
        if (i % init == 0) //整除则返回init
        {
            return init;
        } else    //否则再对余数和init进行求最大公约数
        {
            return greatestDivisorGcd(i % init, init);
        }
    }
}
