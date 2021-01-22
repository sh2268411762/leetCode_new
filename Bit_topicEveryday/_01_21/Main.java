package Bit_topicEveryday._01_21;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A1 = 0, A2 = 0, A3 = 0, a4 = 0, A5 = 0;
        double A4 = 0;
        int x, i = 1;
        int n = sc.nextInt();   //输入数字的个数
        while (n > 0)
        {
            n--;
            x = sc.nextInt();
            switch (x % 5)
            {
                case 0://整除
                    if (0 == x % 2)  //偶数
                    {
                        A1 += x;
                    }
                    break;

                case 1://整除余1进行交错求和
                    A2 += (i * x);
                    i = -i;
                    break;

                case 2:
                    A3++;
                    break;

                case 3:
                    A4 += x;
                    a4++;
                    break;

                case 4:
                    if (x > A5)
                    {
                        A5 = x;
                    }
                    break;
            }
        }

        Print(A1);
        if (A2 != 0)
        {
            System.out.println(A2 + " ");
        } else
        {
            System.out.println("N ");
        }
        Print(A3);
        if (A4 > 0)
        {
            System.out.printf("%.1f ", A4 / a4);
        } else
        {
            System.out.println("N ");
        }
        Print(A5);
    }

    public static void Print(int a1)
    {
        if (a1 > 0)
        {
            System.out.println(a1 + " ");
        } else
        {
            System.out.println("N ");
        }
    }
}
