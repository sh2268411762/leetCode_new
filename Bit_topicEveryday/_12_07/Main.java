package Bit_topicEveryday._12_07;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int temp = sc.nextInt();
            list.add(temp);
        }

        StringBuilder str = new StringBuilder();
        for (int i = 1; i < list.size(); i++) { //确定输出的第一个数
            if (list.get(i) != 0) {
                str.append(i);
                list.set(i, list.get(i) - 1);
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {//从小到大输出
            if (list.get(i) != 0) {
                for (int j = 0; j < list.get(i); j++) {
                    str.append(i);
                }
            }
        }
        System.out.println(str.toString());
    }
}
