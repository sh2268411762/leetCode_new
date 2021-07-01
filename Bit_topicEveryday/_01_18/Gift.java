package Bit_topicEveryday._01_18;


public class Gift
{
    public int getValue(int[] gifts, int n)
    {
        // write code here
        n /= 2;
        for (int i = 0; i < gifts.length; i++)
        {
            int temp = -1;
            for (int j = i; j < gifts.length; j++)
            {
                if (gifts[i] == gifts[j])
                {
                    temp += 1;
                }
            }
            if (temp >= n)
            {
                return gifts[i];
            }
        }
        return 0;
    }
}
