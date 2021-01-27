package Bit_topicEveryday._01_26;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n = sc.nextInt(); //数n
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
            {
                array[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            boolean flag = true;
            for (int i = 0; i < n; i++)
            {
                if (x == array[i])
                {
                    System.out.println(i);
                    flag = false;
                }
            }
            if(flag)
            {
                System.out.println(-1);
            }
        }
    }
}
