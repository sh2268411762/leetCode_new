package sjjg_OJ;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 1. 两数之和
 * @Date 2021/4/11 下午 17:39
 */
public class Test31
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> ret = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            ret.put(nums[i], target - nums[i]);
            for (int j = 0; j < nums.length; j++)
            {
                if (nums[j] == ret.get(nums[i]) && i != j)
                {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
