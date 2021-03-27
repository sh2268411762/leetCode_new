package Java58.排序;

import java.util.Arrays;
import java.util.Random;

//希尔排序（分组插排）
public class shellSort
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
        shellSort1(a1);
        System.out.println(Arrays.toString(a1) + "\n");

        long[] a2 = func2();
        System.out.println(Arrays.toString(a2));
        shellSort1(a2);
        System.out.println(Arrays.toString(a2) + "\n");

        long[] a3 = func3();
        System.out.println(Arrays.toString(a3));
        shellSort1(a3);
        System.out.println(Arrays.toString(a3) + "\n\n");
    }


    public static void shellSort1(long[] array)
    {
        int gap = array.length;
        while (gap > 1)
        {
            insertSortGap(array, gap);
            gap = (gap / 3) + 1; // OR gap = gap / 2;
        }
        insertSortGap(array, 1);
    }

    private static void insertSortGap(long[] array, int gap)
    {
        for (int i = 1; i < array.length; i++)
        {
            long v = array[i];
            int j = i - gap;
            for (; j >= 0 && array[j] > v; j -= gap)
            {
                array[j + gap] = array[j];
            }
            array[j + gap] = v;
        }
    }
}
