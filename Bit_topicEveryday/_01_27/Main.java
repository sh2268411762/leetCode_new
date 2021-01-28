package Bit_topicEveryday._01_27;

import java.util.Scanner;

public class Main
{
    public static void main1(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n = sc.nextInt();
            int nn = (int) Math.pow(n, 2);
            int i = 0;

            if (2 <= n && n <= 9)
            {
                i = 10;
            } else
            {
                i = 100;
            }

            if ((nn - n) % i == 0)
            {
                System.out.println("Yes!");
            } else
            {
                System.out.println("No!");
            }
        }
    }

    //转换为字符串
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext())
        {
            int n = sc.nextInt();
            String str1 = n * n + "";
            String str2 = n + "";

            if (str1.indexOf(str2) == str1.length() - str2.length())
            {
                System.out.println("Yes!");
            } else
            {
                System.out.println("No!");
            }
        }
    }
}
