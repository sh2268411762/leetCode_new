package Bit_topicEveryday._11_25;

import java.util.*;

public class commonString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String temp = "[" + s2 + "]";
            String ret = s1.replaceAll(temp, "");
            System.out.println(ret);
        }
    }
}
