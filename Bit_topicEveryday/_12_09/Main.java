package Bit_topicEveryday._12_09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            if(n <= 0 || n > 1000)
            {
                break;
            }
            int[] a = new int[n];
            for(int i = 0;i < n;i++)
            {
                a[i] = sc.nextInt();
            }

            int ret = 0;
            int score = sc.nextInt();
            for(int i = 0;i < n;i++)
            {
                if(a[i] == score)
                {
                    ret++;
                }
            }
            System.out.println(ret);
        }
    }
}
