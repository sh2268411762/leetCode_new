package Bit_topicEveryday._01_24;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  //课程数
        int[] credit = new int[n];  //学分
        int[] score = new int[n];   //实际得分
        // 总的学分
        int credits=0;
        for (int i = 0; i < n; i++){
            credit[i]=scanner.nextInt();
            credits+= credit[i];
        }
        for (int i = 0; i < n; i++)
        {
            score[i]= scanner.nextInt();
        }
        double average =0;
        for (int i = 0; i < n; i++)
        {
            average+= scoreToGPA(score[i])*credit[i];
        }
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println(df.format(average/credits));
    }

    //转为学分
    static double scoreToGPA(int score){
        if (score>=90) return 4.0;      //90-100  4.0
        else if (score>=85) return 3.7; //85-89   3.7
        else if (score>=82) return 3.3; //82-84   3.3
        else if (score>=78) return 3.0; //78-81   3.0
        else if (score>=75) return 2.7; //75-77   2.7
        else if (score>=72) return 2.3; //72-74   2.3
        else if (score>=68) return 2.0; //68-71   2.0
        else if (score>=64) return 1.5; //64-67   1.5
        else if (score>=60) return 1.0; //60-63   1.0
        else return 0.0;
    }
}