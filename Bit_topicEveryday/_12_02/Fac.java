package Bit_topicEveryday._12_02;

import java.util.Scanner;

public class Fac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            while (n != 0) {
                count += n / 5;   //
                n /= 5;
            }
            System.out.println(count);
        }
    }
}
