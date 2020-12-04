package Bit_topicEveryday._12_04;

import java.util.*;

public class Solution {
    public int[] multiply(int[] A) {
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();

        int n = A.length;
        int[] B = new int[n];
        for(int i = 0;i<n;i++)
        {
            B[i] = mul(i,n,A);
        }
        return B;
    }

    public static int mul(int m,int n,int a[])
    {
        int ret = 1;
        for(int i=0;i<n;i++)
        {
            if(m == i)
            {
                break;
            }
            ret *= a[i];
        }
        return ret;
    }
}
