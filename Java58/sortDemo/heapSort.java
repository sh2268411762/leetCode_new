package Java58.sortDemo;

import java.util.Arrays;
import java.util.Random;

//堆排序
public class heapSort
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
        heapSort1(a1);
        System.out.println(Arrays.toString(a1) + "\n");

        long[] a2 = func2();
        System.out.println(Arrays.toString(a2));
        heapSort1(a2);
        System.out.println(Arrays.toString(a2) + "\n");

        long[] a3 = func3();
        System.out.println(Arrays.toString(a3));
        heapSort1(a3);
        System.out.println(Arrays.toString(a3) + "\n\n");
    }

    public static void heapSort1(long[] array)
    {
        //建堆
        createHeap(array, array.length);

        //进行选择的过程，一共需要 array.length - 1组
        for (int i = 0; i < array.length - 1; i++)
        {
            long temp = array[0];
            array[0] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

            adjustDown(array, array.length - i - 1, 0);
        }
        for (int i = 0; i < array.length / 2; i++)
        {
            long t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
    }

    public static void adjustDown(long[] array, int size, int index)
    {
        while (true)
        {
            //判断 index 是不是叶子结点
            int leftIndex = 2 * index + 1;
            if (leftIndex >= size)
            {
                return;
            }

            //找最小的孩子
            int minIndex = leftIndex;   //假设最小的孩子为左孩子
            int rightIndex = leftIndex + 1;
            if (rightIndex < size && array[rightIndex] < array[leftIndex])  //右孩子小于左孩子
            {
                minIndex = rightIndex;
            }

            //比较最小孩子和index的值
            if (array[index] <= array[minIndex])
            {
                return;
            }

            //交换
            long temp = array[index];
            array[index] = array[minIndex];
            array[minIndex] = temp;

            //将最小的孩子视为index，继续循环
            index = minIndex;
        }
    }

    public static void createHeap(long[] array, int size)
    {
        //找到层序遍历的最后一个节点
        int lastIndex = size - 1;
        //找到最后一个节点的父节点的下标
        int lastParentIndex = (lastIndex - 1) / 2;
        //从[lPI,0] 不断向下调整
        for (int i = lastParentIndex; i >= 0; i--)
        {
            adjustDown(array, size, i);
        }
    }
}
