package Java40.thread_study.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 需要用到多线程
 * @Date 2021/6/2 上午 10:06
 */
public class SingleThread
{
    public static void main(String[] args)
    {
        //第一种：计算量大，耗时长
        calculate(new ArrayList<>());
        calculate(new ArrayList<>());

        //第二种：阻塞任务
        print(new Scanner(System.in));
    }

    public static int calculate(List<Integer> list)
    {
        //計算量大，耗时长
        return 0;
    }

    public static void print(Scanner sc)
    {
        System.out.println(sc.hasNextLine());
    }
}
