package Bit_topicEveryday._12_02;

import java.util.Scanner;

//将整数逆序输出
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            char[] num = Integer.toString(n).toCharArray();

            int start = 0, end = Integer.toString(n).length() - 1;
            while (start < end) {
                char temp = num[start];
                num[start] = num[end];
                num[end] = temp;
                start++;
                end--;
            }
            System.out.println(String.valueOf(num));
        }
    }
}
