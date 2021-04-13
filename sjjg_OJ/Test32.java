package sjjg_OJ;

import java.util.*;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 771. 宝石与石头
 * @Date 2021/4/11 下午 18:12
 */
public class Test32
{
    public int numJewelsInStones(String jewels, String stones)
    {
        if (stones == null || stones.isEmpty())
        {
            return 0;
        }
        if (jewels == null || jewels.isEmpty())
        {
            return 0;
        }
        char[] charsS = stones.toCharArray();

        Map<Integer, Character> map = new TreeMap<>();
        for (int i = 0; i < stones.length(); i++)
        {
            map.put(i, charsS[i]);
        }
        int count = 0;
        for (char ch : map.values())
        {
            String str = new String(String.valueOf(ch));
            if (jewels.contains(str))
            {
                count++;
            }
        }
        return count;
    }
}
