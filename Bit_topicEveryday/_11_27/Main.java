package Bit_topicEveryday._11_27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A = 0, B = 0, C = 0;
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        a = Integer.parseInt(num.split(" ")[0]);
        b = Integer.parseInt(num.split(" ")[1]);
        c = Integer.parseInt(num.split(" ")[2]);
        d = Integer.parseInt(num.split(" ")[3]);

        if (a >= -30 && a <= 30 && b >= -30 && b <= 30 && c >= -30 && c <= 30 && d >= -30 && d <= 30) {
            A = (a + c) / 2;
            B = (b + d) / 2;
            C = (d - b) / 2;
            if (A - B == a && B - C == b && A + B == c && B + C == d) {
                System.out.println(A + " " + B + " " + C);
            } else {
                System.out.println("No");
            }
        }
    }
}
