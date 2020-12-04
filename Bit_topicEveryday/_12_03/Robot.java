package Bit_topicEveryday._12_03;

import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        int[][] arr = new int[x][y];
        arr[0][0] = 1;
        for(int i = 1;i<x;i++)
        {
            arr[i][0] = arr[i-1][0];
        }
        for(int i=1;i<y;i++)
        {
            arr[0][i] = arr[0][i-1];
        }
        for(int i=1;i<x;i++)
        {
            for(int j=1;j<y;j++)
            {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        return arr[x-1][y-1];
    }

    public static void main(String[] args) {
        Robot r = new Robot();
        int ret = r.countWays(2,2);
        System.out.println(ret);
    }
}
