package sjjg_OJ;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * @Date 2021/4/2 下午 20:07
 */
public class Test27
{
    public static int singleNumber(int[] nums)
    {
        int ret = 0;
        for (int i = 0; i < nums.length; i++)
        {
            ret ^= nums[i];
        }
        return ret;
    }

    public static int singleNumber1(int[] nums)
    {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(nums[i]))
            {
                map.remove(nums[i]);
            } else
            {
                map.put(nums[i], i);
            }
        }

        int ret = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            ret = entry.getKey();
        }
        return ret;
    }

    public static void main(String[] args)
    {
        System.out.println(singleNumber(new int[]{1, 2, 3, 4, 4, 3, 2, 1, 5}));
    }
}
