package Bit_topicEveryday._11_30;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[][] a = new int[1000][1000];
        for (int[] ints : a) {
            Arrays.fill(ints, 0);
        }

        int w = 0, h = 0, ret = 0;
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        h = sc.nextInt();
        if ((w >= 1 && w <= 1000) && (h >= 1 && h <= 1000)) {
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    if (a[i][j] == 0) {
                        ret++;
                        if ((i + 2) < w) {
                            a[i + 2][j] = -1;
                        }
                        if ((j + 2) < h) {
                            a[i][j + 2] = -1;
                        }
                    }
                }
            }
            System.out.println(ret);
        }
    }
}
