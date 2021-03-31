package sjjg_OJ;

public class Test14
{
    private final int[] array;
    private int size;
    private int frontIndex;
    private int rearIndex;

    public Test14(int k)
    {
        array = new int[k];
        size = 0;
        frontIndex = 0;
        rearIndex = 0;
    }

    public boolean enQueue(int value)
    {
        if (size == array.length)
        {
            return false;
        }

        array[rearIndex] = value;
        size++;
        rearIndex++;
        if (rearIndex == array.length)
        {
            rearIndex = 0;
        }

        return true;
    }

    public boolean deQueue()
    {
        if (0 == size)
        {
            return false;
        }

        size--;
        frontIndex++;
        if (frontIndex == array.length)
        {
            frontIndex = 0;
        }

        return true;
    }

    public int Front()
    {
        if (0 == size)
        {
            return -1;
        }
        return array[frontIndex];
    }

    public int Rear()
    {
        if (0 == size)
        {
            return -1;
        }

        if (rearIndex - 1 == -1)
        {
            return array[array.length - 1];
        }
        return array[rearIndex - 1];
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isFull()
    {
        return size == array.length;
    }
}
