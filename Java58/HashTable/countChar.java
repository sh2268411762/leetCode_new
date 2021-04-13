package Java58.HashTable;

import java.util.Arrays;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 统计字符出现次数
 * @Date 2021/4/13 上午 9:07
 */
public class countChar
{
    public static void main(String[] args)
    {
        String s = "sefefwesdcdisunvdsnevs";
        int[] count = new int[26];
        for (char ch : s.toCharArray())
        {
            int index = ch - 'a';
            count[index]++;
        }
        System.out.println(Arrays.toString(count));

    }
}
