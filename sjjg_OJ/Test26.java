package sjjg_OJ;

import java.util.Scanner;

public class Test26
{
    public static long pow(int n, int p)
    {
        long ret = 1;
        for (int i = 0; i < p; i++)
        {
            ret *= n;
        }
        return ret;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext())
        {
            String str = sc.next();

            long n = hexToTen(str);

            System.out.printf("%15d", n);
        }
    }

    public static long hexToTen(String str)
    {
        char[] ch = str.toCharArray();

        long ret = 0;
        for (char c : ch)
        {
            int digit = charToSum(c);

            ret = 16 * (ret + digit);
        }
        return ret / 16;
    }

    private static int charToSum(char c)
    {
        if (c >= '0' && c <= '9')
        {
            return c - '0';
        } else
        {
            return c - 'A' + 10;
        }
    }
}
