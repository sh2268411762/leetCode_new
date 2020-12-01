package Bit_topicEveryday._12_01;

import java.util.*;

public class K {
    public static int sort(int[] num,int start,int end)
    {
        int temp = num[start];
        while(start < end)
        {
            while(start < end && num[end] >= temp)
            {
                end--;
            }
            num[start] = num[end];

            while(start <end && num[start]  < temp)
            {
                start++;
            }
            num[end] =num[start];
        }
        num[start] = temp;
        return start;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String str = sc.nextLine();
            String[] num = str.split(" ");
            int[] Num = new int[num.length-1];
            for(int i=0;i< num.length-1;i++)  //最后一个为k
            {
                Num[i] = Integer.parseInt(num[i]);
            }
            int k = Integer.parseInt(num[num.length-1]);
            int l=0,r=Num.length-1;
            int index = sort(Num,l,r);

            while(index !=k)
            {
                if(index > k)
                {
                    r=index-1;
                    index = sort(Num,l,r);
                }
                else
                {
                    l=index+1;
                    index=sort(Num,l,r);
                }
            }

            Arrays.sort(Num,0,k);
            for(int i=0;i<k;i++)
            {
                if(i==k-1)
                {
                    System.out.print(Num[i]);
                }
                else
                {
                    System.out.print(Num[i] + " ");
                }
            }
        }
    }
}
