package Java58.sortDemo;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 快速排序
 * @Date 2021/3/29 下午 19:36
 */
public class quickSort
{
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
        quickSort1(a1);
        System.out.println(Arrays.toString(a1));
        System.out.println();

        long[] a2 = func2();
        System.out.println(Arrays.toString(a2));
        quickSort1(a2);
        System.out.println(Arrays.toString(a2));
        System.out.println();

        long[] a3 = func3();
        System.out.println(Arrays.toString(a3));
        quickSort1(a3);
        System.out.println(Arrays.toString(a3));
        System.out.println();
    }

    public static void quickSort1(long[] array)
    {
        quickSortInternal(array, 0, array.length - 1);
    }

    public static void quickSortInternal(long[] array, int i, int j)
    {
        int size = j - i + 1;
        if (size <= 1)
        {
            return;
        }

        //选择其中一个数（最左边）
        //执行分组
        //keyIndex
        int keyIndex = partition(array, i, j);

        //分别对左右区间进行处理
        quickSortInternal(array, i, keyIndex - 1);
        quickSortInternal(array, keyIndex + 1, j);
    }

    //选择 array[i] 作为特殊值
    //遍历区间，进行比较
    //
    private static int partition(long[] array, int i, int j)
    {
        //Hover 法
        //return p(array, i, j);
        //挖坑法
        //return digAHole(array, i, j);
        //
        return around(array, i, j);


    }

    public static void swap(long[] array, int left, int right)
    {
        long temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static int around(long[] array, int i, int j)
    {
        int seprateIndex = i + 1;
        for (int ii = i; ii <= j; ii++)
        {
            if (array[ii] < array[i])
            {
                swap(array, ii, seprateIndex);
                seprateIndex++;
            }
        }
        swap(array, i, seprateIndex - 1);

        return seprateIndex - 1;
    }

    public static int p(long[] array, int i, int j)
    {
        int left = i;
        int right = j;

        long key = array[i];
        while (left < right)
        {
            while (left < right && array[right] >= key)
            {
                right--;
            }
            while (left < right && array[left] <= key)
            {
                left++;
            }

            swap(array, left, right);
        }
        swap(array, i, left);

        return left;
    }

    public static int digAHole(long[] array, int i, int j)
    {
        int left = i, right = j;
        long key = array[i];

        while (left < right)
        {
            while (left < right && array[right] >= key)
            {
                right--;
            }
            array[left] = array[right];

            while (left < right && array[left] <= key)
            {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = key;
        return left;
    }
}
