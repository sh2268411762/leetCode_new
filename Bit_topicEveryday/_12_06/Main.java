package Bit_topicEveryday._12_06;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //列
        String str = sc.next();

        char ch = str.charAt(0);

        int n = (num + 1)/2;//行
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<num;j++)
            {
                //i=0 第一行
                //i=n-1 最后一行
                //j=0 每一行的第一列
                //j=num-1 每一行的最后一列
                if(i==0 || j==0 || i==n - 1 || j==num-1)
                {
                    System.out.print(ch);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
