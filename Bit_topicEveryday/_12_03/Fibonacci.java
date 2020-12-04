package Bit_topicEveryday._12_03;

import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n)
    {
        int f0 = 0;
        int f1 = 1;
        int f2 = f1 + f0;

        while(n > 2)
        {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
            n--;
        }
        return f2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int ret1 = 0;
        int ret2 = 0;
        while(true)
        {
            if(fib(i) < num)
            {
                ret1 = num - fib(i);
            }
            else
            {
                ret2 = fib(i) - num;
                break;
            }
            i++;
        }
        if(ret1 < ret2)
        {
            System.out.println(ret1);
        }
        else
        {
            System.out.println(ret2);
        }
    }
}
