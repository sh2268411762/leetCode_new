package Bit_topicEveryday._01_25;

import java.util.*;

public class Main1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n = sc.nextInt();   //人数
            LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
            sc.nextLine();
            String str = sc.nextLine(); //候选人名字，以空格分隔
            String[] array = str.split(" ");
            for (int i = 0; i < array.length; i++)
            {
                map.put(array[i], 0);
            }
            map.put("Invalid", 0);
            int m = sc.nextInt();   //投票数
            sc.nextLine();
            String str1 = sc.nextLine();
            String[] arrays = str1.split(" ");
            for (String s : arrays)
            {
                if (map.containsKey(s))
                {
                    map.put(s, map.get(s) + 1);
                } else
                {
                    map.put("Invalid", map.get("Invalid") + 1);
                }
            }
            Set<String> set = map.keySet();
            for (String s : set)
            {
                System.out.println(s + " : " + map.get(s));
            }
        }
    }
}
