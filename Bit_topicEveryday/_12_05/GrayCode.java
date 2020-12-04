package Bit_topicEveryday._12_05;

import java.util.*;

public class GrayCode {
    public String[] getGray(int n) {
        String[] ret = new String[n + 1];
        while (n >= 0) {
            if (n % 2 == 1) {
                ret[n] = "1";
            } else {
                ret[n] = "0";
            }
            n--;
        }
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i]);
        }
        return ret;
    }

    public static void main(String[] args) {
        GrayCode g = new GrayCode();
        g.getGray(1);
    }
}
