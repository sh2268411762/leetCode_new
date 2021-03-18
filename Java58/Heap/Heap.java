package Java58.Heap;

public class Heap
{
    public static void adjustDown(int[] array, int size, int index)
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
            int temp = array[index];
            array[index] = array[minIndex];
            array[minIndex] = temp;

            //将最小的孩子视为index，继续循环
            index = minIndex;
        }
    }

    public static void createHeap(int[] array, int size)
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

    public static void adjustUp(int[] array, int size, int index)
    {
        while (true)
        {
            if (0 == index)
            {
                break;
            }

            int parentIndex = (index - 1) / 2;
            if (array[parentIndex] <= array[index])
            {
                break;
            }
            int temp = array[index];
            array[index] = array[parentIndex];
            array[parentIndex] = temp;

            index = parentIndex;
        }
    }

    public static void main(String[] args)
    {
        int[] a = new int[10];
        a[0] = 100;
        a[1] = 10;
        a[2] = 1000;
        a[3] = 16000;
        a[4] = 180;
        a[5] = 20;
        a[6] = 2100;
        a[7] = 1440;
        a[8] = 12;
        a[9] = 10022;
        System.out.println("排序前：");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n排序后：");
        createHeap(a, 10);
        for (int i = 0; i < 10; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
