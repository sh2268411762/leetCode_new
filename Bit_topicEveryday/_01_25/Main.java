package Bit_topicEveryday._01_25;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int num = sc.nextInt();
            System.out.println(fun(num) + " " + fun(num * num));
        }

    }

    private static int fun(int num)
    {
        int ret = 0;
        while (num != 0)
        {
            ret += num % 10;
            num /= 10;
        }
        return ret;
    }
}
