package Bit_topicEveryday._12_07;

import java.util.Scanner;

public class Main2 {
    public static String GetSequeOddNum(int m) {
        int n = (int) Math.pow(m, 3);
        StringBuilder ret = new StringBuilder();
        int r = 0;
        for (int i = 1; i < n; i += 2) {
            int t = m;
            for (int j = i; t > 0; j += 2) {
                r += j;
                ret.append(j);
                if(t != 1)
                {
                    ret.append("+");
                }
                t--;
            }

            if (r == n) {
                return ret.toString();
            } else {
                r = 0;
                ret.delete(0, ret.capacity() - 1);
            }
        }
        return null;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int m = sc.nextInt();
            System.out.println(GetSequeOddNum(m));
        }
    }
}
