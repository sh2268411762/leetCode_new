package Bit_topicEveryday._01_20;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean flag = true;
        int[] a = new int[128]; //保存第一个字符串
        int[] b = new int[128]; //保存第二个字符串
        int[] c = new int[128]; //保存差值

        String str1 = "";
        String str2 = "";
        Scanner sc = new Scanner(System.in);

        str1 = sc.next();
        str2 = sc.next();
        for (int i = 0; i < str1.length(); i++)
        {
            a[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++)
        {
            b[str2.charAt(i)]++;
        }
        for (int i = 48; i < 128; i++)  //0-9，A-Z，a-z    最小的为48
        {
            c[i] = a[i] - b[i];
            if (c[i] < 0)
            {
                flag = false;   //某颗珠子没有
            }
        }
        int count = 0;
        if (flag)
        {
            for (int i = 48; i < 128; i++)
            {
                if (c[i] > 0)
                {
                    count += c[i];
                }
            }
            System.out.println("Yes" + " " + count);
        } else
        {
            for (int i = 48; i < 128; i++)
            {
                if (c[i] < 0)
                {
                    count += c[i];
                }
            }
            count = -count;
            System.out.println("No" + " " + count);
        }
    }
}
