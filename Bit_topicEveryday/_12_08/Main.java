package Bit_topicEveryday._12_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int ret = 0;
        while (x != 0 && ret <= 300000) {
            x = ((x << 1) + 1) % 1000000007;
            ret++;
        }
        int r = (ret + 2) / 3;
        if (r > 100000) {
            System.out.println(-1);
        } else {
            System.out.println(r);
        }
    }
}
