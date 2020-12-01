package Bit_topicEveryday._11_30;

import java.util.Scanner;

public class MinCommonMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0 && b > 0) {
            if (a < b) {
                a = a ^ b;
                b = a ^ b;
                a = a ^ b;
            }
            for (int i = a; i <= a * b; i++) {
                if ((i % a == 0) && (i % b == 0)) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
