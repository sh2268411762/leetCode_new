package Bit_topicEveryday._11_24;

import java.util.Scanner;

public class MaxString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String ret = "";
        int i = 0, max_len = 0, strlen = str.length();
        while (i < strlen) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                i++;
            } else {
                int len = 0;
                StringBuilder temp = new StringBuilder();
                while (i < strlen && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    temp.append(String.valueOf(str.charAt(i)));
                    i++;
                    len++;
                }
                if (len > max_len) {
                    ret = temp.toString();
                    max_len = len;
                }
            }
        }
        System.out.println(ret);
    }
}
