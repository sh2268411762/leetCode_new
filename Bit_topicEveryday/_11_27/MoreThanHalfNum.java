package Bit_topicEveryday._11_27;

import java.util.Scanner;

public class MoreThanHalfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] s = num.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(num.split(" ")[i]);
        }

        int n = 0;
        if (arr.length % 2 == 0) {
            n = arr.length / 2;
        } else {
            n = arr.length / 2 + 1;
        }

        int ret = arr[0];
        boolean flag = false;
        for (int value : arr) {
            int count = 0;
            for (int i : arr) {
                if (value == i) {
                    count++;
                }
            }
            if (arr.length % 2 == 0) {
                if (count > n) {
                    flag = true;
                    ret = value;
                    break;
                }
            } else {
                if (count >= n) {
                    flag = true;
                    ret = value;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println(ret);
        } else {
            System.out.println(0);
        }
    }
}
