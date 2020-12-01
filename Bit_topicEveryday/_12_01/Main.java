package Bit_topicEveryday._12_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        while(!sc.hasNext("0"))
        {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }

            List<Integer> l = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                l.add(i);
            }  //添加数据
            int j = 0;
            while (l.size() > 1) {
                j = (j + 2) % l.size();  //每个两个移除一个
                l.remove(j);
            }
            System.out.println(l.get(0));  //最后剩余的数字内容就是原来的下标
        }
    }
}
