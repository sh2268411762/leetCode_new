package Java58.sortDemo;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 归并排序
 * @Date 2021/3/29 下午 21:20
 */
public class mergeSort
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
        mergeSort1(a1);
        System.out.println(Arrays.toString(a1));
        System.out.println();

        long[] a2 = func2();
        System.out.println(Arrays.toString(a2));
        mergeSort1(a2);
        System.out.println(Arrays.toString(a2));
        System.out.println();

        long[] a3 = func3();
        System.out.println(Arrays.toString(a3));
        mergeSort1(a3);
        System.out.println(Arrays.toString(a3));
        System.out.println();
    }

    public static void mergeSort1(long[] array)
    {
        mergeSortInternal(array, 0, array.length);
    }

    private static void mergeSortInternal(long[] array, int lowIndex, int highIndex)
    {
        int size = highIndex - lowIndex;

        if (size <= 1)
        {
            return;
        }

        int middleIndex = (lowIndex + highIndex) / 2;
        mergeSortInternal(array, lowIndex, middleIndex);
        mergeSortInternal(array, middleIndex, highIndex);

        merge(array, lowIndex, middleIndex, highIndex);

    }

    private static void merge(long[] array, int lowIndex, int middleIndex, int highIndex)
    {
        int size = highIndex - lowIndex;
        long[] newArray = new long[size];

        int left = lowIndex, right = middleIndex, e = 0;

        while (left < middleIndex && right < highIndex)
        {
            if (array[left] <= array[right])
            {
                newArray[e] = array[left];
                left++;
                e++;
            } else
            {
                newArray[e] = array[right];
                right++;
                e++;
            }
        }

        if (left < middleIndex)
        {
            while (left < middleIndex)
            {
                newArray[e++] = array[left++];
            }
        } else
        {
            while (right < highIndex)
            {
                newArray[e++] = array[right++];
            }
        }
        if (size >= 0)
        {
            System.arraycopy(newArray, 0, array, lowIndex, size);
        }
    }
}
