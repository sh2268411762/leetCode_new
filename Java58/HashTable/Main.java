package Java58.HashTable;

import java.util.*;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/13 下午 15:51
 */
public class Main
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map.put("sh", 21));
        System.out.println(map.put("wcr", 19));
        System.out.println(map.put("sh", 22));
        map.put("wucuirong", 19);

        for (String key : map.keySet())
        {
            System.out.print(key + " ");
        }

    }
}
