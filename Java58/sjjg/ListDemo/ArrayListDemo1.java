package Java58.sjjg.ListDemo;

import java.util.Arrays;

public class ArrayListDemo1 implements List
{
    private int[] array;//顺序表内部数组
    private int size;   //顺序表元素个数

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++)
        {
            sb.append(array[i]);
            if (i != size - 1)
            {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //90
    public ArrayListDemo1()
    {
        //初始容量为10个
        array = new int[10];
        //初始元素个数为0
        size = 0;
    }

    //10
    public ArrayListDemo1(List other)
    {
        array = new int[other.size()];
        for (int i = 0; i < other.size(); i++)
        {
            array[i] = other.get(i);
        }
        size = other.size();
    }


    @Override
    public boolean add(Integer e)
    {
        if (array.length == size)
        {
            ensureCapacity(array.length * 2);
        }
        array[size++] = e;
        return true;
    }

    public void ensureCapacity(int capacity)
    {
        if (this.array.length >= capacity)
        {
            return;
        }

        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++)
        {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }


    @Override
    public void add(int index, Integer e)
    {
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException("下标不合法：" + index);
        }

        if (array.length == size)
        {
            ensureCapacity(array.length * 2);
        }
        int i = size;
        while (i > index)
        {
            array[i] = array[i - 1];
            i--;
        }
        size++;
        array[index] = e;
    }

    @Override
    public Integer remove(int index)
    {
        if (index < 0 || index > size - 1)
        {
            throw new IndexOutOfBoundsException("下标不合法：" + index);
        }

        int e = array[index];
        int i = index + 1;
        while (i < size)
        {
            array[i - 1] = array[i];
            i++;
        }
        size--;
        return e;
    }

    @Override
    public boolean remove(Integer e)
    {
        for (int i = 0; i < size; i++)
        {
            if (array[i] == e)
            {
                remove(i);
                return true;
            }
        }
        return false;

//        int index = indexOf(e);
//        if(index != -1)
//        {
//            remove(index);
//            return true;
//        }
//        else
//        {
//            return false;
//        }
    }

    @Override
    public Integer get(int index)
    {
        if (index < 0 || index > size - 1)
        {
            throw new IndexOutOfBoundsException("下标不合法：" + index);
        }

        return array[index];
    }

    @Override
    public Integer set(int index, Integer e)
    {
        if (index < 0 || index > size - 1)
        {
            throw new IndexOutOfBoundsException("下标不合法：" + index);
        }

        Integer old = array[index];
        array[index] = e;
        return old;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public void clear()
    {
        Arrays.fill(array, -1);
        size = 0;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    @Override
    public boolean contains(Integer e)
    {
        return indexOf(e) != -1;
    }

    @Override
    public int indexOf(Integer e)
    {
        for (int i = 0; i < size; i++)
        {
            if (array[i] == e)
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e)
    {
        for (int i = size - 1; i >= 0; i--)
        {
            if (array[i] == e)
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator iterator()
    {
        return new ArrayListDemo1Iterator(this);
    }
}
