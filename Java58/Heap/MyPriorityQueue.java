package Java58.Heap;

public class MyPriorityQueue
{
    private static Integer[] array;
    private static int size;


    public static void main(String[] args)
    {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.add(3);
        queue.add(5);
        queue.add(2);
        queue.add(7);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }

    public MyPriorityQueue()
    {
        array = new Integer[100];
        size = 0;
    }

    public Integer element()
    {
        if (size == 0)
        {
            throw new RuntimeException("空");
        }
        return array[0];
    }

    public static void adjustDown(int index)
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

    public Integer remove()
    {
        if (size == 0)
        {
            throw new RuntimeException("空");
        }

        int del = array[0];
        array[0] = array[size - 1];
        size--;

        adjustDown(0);
        return del;
    }

    public void add(Integer e)
    {
        array[size] = e;
        size++;
        adjustUp(size - 1);
    }

    public static void adjustUp(int index)
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
}
