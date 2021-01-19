package Bit_topicEveryday._01_17;


public class Substr
{
    public boolean[] chkSubStr(String[] p, int n, String s)
    {
        // write code here
        boolean[] ret = new boolean[p.length];
        for (int i = 0; i < p.length; i++)
        {
            if (s.contains(p[i]))
            {
                ret[i] = true;
            }
            else
            {
                ret[i] = false;
            }
        }
        return ret;
    }
}
