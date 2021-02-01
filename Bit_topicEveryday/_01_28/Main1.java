package Bit_topicEveryday._01_28;

import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n = sc.nextInt();     //数组元素数
            int sum = sc.nextInt();   //和为sum

            int[] array = new int[n];
            for (int i = 0; i < n; i++)
            {
                array[i] = sc.nextInt();
            }//输入数组元素

            long[] arr = new long[sum + 1];
            arr[0] = 1;
            for (int k : array)
            {
                for (int j = sum; j >= 0; j--)
                {
                    if (j >= k)
                    {
                        arr[j] += arr[j - k];
                    }
                }
            }
            System.out.println(arr[sum]);
        }
    }
}
