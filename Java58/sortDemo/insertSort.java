package Java58.sortDemo;

import java.util.Arrays;
import java.util.Random;

//插入排序
//具备稳定性
public class insertSort
{
    public static void insertSort1(long[] array)
    {
        //数据一共 array.length 个
        //
        for (int i = 0; i < array.length - 1; i++)
        {
            //有序：[0,i + 1)
            //无序：[i + 1,array.length - 1]
            long key = array[i + 1];

            //依次在有序期间进行比较
            int j;
            for (j = i; j >= 0; j--)
            {
                //array[j] 与 key 比较
                if (key < array[j])
                {
                    array[j + 1] = array[j];
                } else
                {
                    break;
                }
            }
            array[j + 1] = key;
        }
    }

    public static long[] func() //随机数组
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

    public static long[] func3()    //逆序数组
    {
        long[] a = func2();
//        long t = a[0];
//        a[0] = a[9];
//        a[9] = t;
//
//        t = a[1];
//        a[1] = a[8];
//        a[8] = t;
//
//        t = a[2];
//        a[2] = a[7];
//        a[7] = t;
//
//        t = a[3];
//        a[3] = a[6];
//        a[6] = t;
//
//        t = a[4];
//        a[4] = a[5];
//        a[5] = t;

//        int count = a.length / 2;
//        int i = 0;
//        while (count > 0)
//        {
//            long t = a[i];
//            a[i] = a[a.length - 1 - i];
//            a[a.length - i - 1] = t;
//
//            i++;
//            count--;
//        }
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
        insertSort1(a1);
        System.out.println(Arrays.toString(a1));

        long[] a2 = func2();
        System.out.println(Arrays.toString(a2));
        insertSort1(a2);
        System.out.println(Arrays.toString(a2));

        long[] a3 = func3();
        System.out.println(Arrays.toString(a3));
        insertSort1(a3);
        System.out.println(Arrays.toString(a3));
    }
}
