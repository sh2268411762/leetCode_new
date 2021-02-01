package Bit_topicEveryday._01_30;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext())
        {
            String str = sc.nextLine();
            StringBuilder ret = new StringBuilder();

            String temp = "";
            if (str.charAt(0) != ' ')
            {
                str = " " + str;
            }
            int i = str.length() - 1;
            while (i >= 0)
            {
                if (str.charAt(i) == ' ')
                {
                    temp = reverse(temp);
                    ret.append(temp);
                    ret.append(" ");
                    temp = "";
                } else
                {
                    temp += str.charAt(i);
                }
                i--;
            }
            System.out.println(ret);
        }
    }

    private static String reverse(String temp)
    {
        StringBuilder ret = new StringBuilder();
        int i = temp.length() - 1;
        while (i >= 0)
        {
            ret.append(temp.charAt(i));
            i--;
        }
        return ret.toString();
    }
}