package Bit_topicEveryday._12_11;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String str = "";
        int size = 0;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) { //控制循环输入
            str = sc.next();     //输入string型基因序列
            size = sc.nextInt(); //int型子串长度

            int start = 0;  //要打印的子串的起始索引
            int max = 0;    //G和C数量
            int len = str.length(); //str的长度
            for (int i = 0; i <= (len - size); i++) {//遍历str
                int count = 0;
                for (int j = i; j < i + size; j++) {//从某一字符开始，遍历size个
                    if (str.charAt(j) == 'G' || str.charAt(j) == 'C') {
                        count++; //统计G和C的数量
                    }
                }
                if (count > max) {//如果G和C的数量大于之前的数量,进行更新
                    start = i;
                    max = count;
                }
            }
            System.out.println(str.substring(start, start + size));
        }
    }
}
