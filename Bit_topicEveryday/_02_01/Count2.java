package Bit_topicEveryday._02_01;

import java.util.*;

public class Count2
{
    public int countNumberOf2s(int n)
    {
//        // write code here
//        int count = 0;
//        StringBuffer str = new StringBuffer();
//        for (int i = 0; i <= n; i++)
//        {
//            str.append(i);
//        }
//        for (int i = 0; i < str.length(); i++)
//        {
//            if (str.charAt(i) == '2')
//            {
//                count++;
//            }
//        }
//        return count;


        int count = 0;
        for (int i = 1; i <= n; i *= 10)
        {
            int a = n / i, b = n % i;
            //之所以补8，是因为当百位为0，则a/10==(a+8)/10，
            //当百位>=2，补8会产生进位位，效果等同于(a/10+1)
            count += (a + 7) / 10 * i + ((a % 10 == 2) ? b + 1 : 0);
        }
        return count;
    }

    public static void main(String[] args)
    {
        Count2 c = new Count2();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int num = sc.nextInt();
            System.out.println(c.countNumberOf2s(num));
        }
    }
}