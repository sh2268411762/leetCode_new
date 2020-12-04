package Bit_topicEveryday._12_04;

import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String NUM = sc.next();
        char[] num = NUM.toCharArray();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(0);
        }//将list初始化为0
        //数字：0 1 2 3 4 5 6 7 8 9
        //个数：0 0 0 0 0 0 0 0 0 0

        for (int i = 0; i < NUM.length(); i++) {
            list.set(num[i] - '0', (list.get(num[i] - '0') + 1));
        }
        //set(int index, E element)
        //用指定的元素替换此列表中指定位置的元素。

        //size()
        //返回此列表中的元素数。
        //get(int index)
        //返回此列表中指定位置的元素。
        for(int i = 0;i<list.size();i++)
        {
            if(list.get(i) > 0)
            {
                System.out.println(i + ":" + list.get(i));
            }
        }
    }
}
