package Java58.排序;

import java.util.Arrays;
import java.util.Random;

//冒泡排序
//具备稳定性
public class bubbleSort
{
    public static long[] func()     //无序数组
    {
        Random random = new Random(20210320);
        long[] array = new long[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static long[] func2()    //有序数组
    {
        long[] a = func();
        Arrays.sort(a);
        return a;
    }

    public static long[] func3()    //逆置数组
    {
        long[] a = func2();
        for (int i = 0; i < a.length / 2; i++)
        {
            long t = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = t;
        }
        return a;
    }

    public static void main(String[] args)
    {
        long[] a1 = func();
        System.out.println(Arrays.toString(a1));
        bubbleSort1(a1);
        System.out.println(Arrays.toString(a1) + "\n");

        long[] a2 = func2();
        System.out.println(Arrays.toString(a2));
        bubbleSort1(a2);
        System.out.println(Arrays.toString(a2) + "\n");

        long[] a3 = func3();
        System.out.println(Arrays.toString(a3));
        bubbleSort1(a3);
        System.out.println(Arrays.toString(a3) + "\n");
    }

    public static void bubbleSort1(long[] array)
    {

        //冒泡次数
        for (int i = 0; i < array.length - 1; i++)
        {
            boolean isSorted = true;    //假设有序

            //有序：[0，a.length-i)
            //无序：[a.length-i,a.length-1]
            //冒泡
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    long t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;

                    isSorted = false;
                }
            }
            if (isSorted)
            {
                break;
            }

        }
    }
}
