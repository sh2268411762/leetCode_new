package Java58.排序;

import java.util.Arrays;
import java.util.Random;

//选择排序
//不具备稳定性
public class selectSort
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
        selectSort1(a1);
        System.out.println(Arrays.toString(a1) + "\n");

        long[] a2 = func2();
        System.out.println(Arrays.toString(a2));
        selectSort1(a2);
        System.out.println(Arrays.toString(a2) + "\n");

        long[] a3 = func3();
        System.out.println(Arrays.toString(a3));
        selectSort1(a3);
        System.out.println(Arrays.toString(a3) + "\n\n");


        long[] a11 = func();
        System.out.println(Arrays.toString(a11));
        selectSort2(a11);
        System.out.println(Arrays.toString(a11) + "\n");

        long[] a22 = func2();
        System.out.println(Arrays.toString(a22));
        selectSort2(a22);
        System.out.println(Arrays.toString(a22) + "\n");

        long[] a33 = func3();
        System.out.println(Arrays.toString(a33));
        selectSort2(a33);
        System.out.println(Arrays.toString(a33) + "\n\n");
    }

    public static void selectSort1(long[] array)
    {
        for (int i = array.length - 1; i >= 0; i--)
        {
            long Max = array[0];
            int index = 0;
            for (int j = 0; j <= i; j++)  //找最大数
            {
                if (Max < array[j])
                {
                    Max = array[j];
                    index = j;
                }
            }

            array[index] = array[i];    //交换
            array[i] = Max;
        }
    }

    public static void selectSort2(long[] array)    //同时从两侧进行选择排序
    {
        for (int i = array.length - 1, k = 0; i >= 0 && k < array.length && k < i; i--, k++)
        {
            long Max = Long.MIN_VALUE;
            int index = 0;
            long Min = Long.MAX_VALUE;
            int indexM = 0;
            for (int j = k; j <= i; j++)  //找最大数
            {
                if (Max < array[j])
                {
                    Max = array[j];
                    index = j;
                }
            }


            array[index] = array[i];    //交换
            array[i] = Max;

            for (int j = k; j <= i - 1; j++)    //找最小数
            {
                if (Min > array[j])
                {
                    Min = array[j];
                    indexM = j;
                }
            }
            array[indexM] = array[k];   //交换
            array[k] = Min;
        }
    }
}
