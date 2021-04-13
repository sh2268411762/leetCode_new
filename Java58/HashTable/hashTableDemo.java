package Java58.HashTable;

import java.util.Arrays;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 哈希表{一个数组+一个哈希函数：可以根据元素，德奥数组中有个合法的下标}
 * 插入：根据元素，得到合法下标，把元素放到哈希表中    哈希冲突：下标重复-->解决：1、线性探测  2、拉链法（Java的 HashMap）
 * @Date 2021/4/13 上午 9:06
 */
public class hashTableDemo
{
    //1、数组
    private Node[] array = new Node[11];

    //2、维护哈希表中的元素个数
    private int size;

    //3、插入是否成功（失败则说明key已经在哈希表中）
    public boolean insert(Integer key)
    {
        //1、将对象转换为int
        int hashValue = key.hashCode();
        //2、将hashValue转换为合法下标
        int index = hashValue % array.length;
        //3、遍历链表
        Node cur = array[index];
        if (cur != null)
        {
            if (key.equals(cur.key))
            {
                return false;
            }
            cur = cur.next;
        }
        //4、头插将key插入
        Node node = new Node(key);
        node.next = array[index];
        array[index] = node;

        //5、维护元素个数
        size++;

        //6、通过维护负载因子，进而维护较低的冲突率
        if (size / array.length * 100 >= 75)
        {
            choir();
        }
        return true;
    }

    private void choir()
    {
        Node[] newArray = new Node[array.length * 2];

        for (int i = 0; i < array.length; i++)
        {
            Node cur = array[i];
            while (cur != null)
            {
                //复制结点
                Integer key = cur.key;
                int hashValue = key.hashCode();
                int index = hashValue % newArray.length;

                Node node = new Node(key);
                node.next = newArray[index];
                newArray[index] = node;

                cur = cur.next;
            }
        }

        array = newArray;
    }

    public boolean remove(Integer key)
    {
        int hashValue = key.hashCode();
        int index = hashValue % array.length;

        Node prev = null;
        Node cur = array[index];
        while (cur != null)
        {
            if (key.equals(cur.key))
            {
                if (prev != null)
                {
                    prev.next = cur.next;
                } else
                {
                    array[index] = cur.next;
                }
                size--;
                return true;
            }

            prev = cur;
            cur = cur.next;
        }
        return false;
    }

    public boolean contains(Integer key)
    {
        int hashValue = key.hashCode();
        int index = hashValue % array.length;

        Node cur = array[index];
        while (cur != null)
        {
            if (key.equals(cur.key))
            {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    public static void main(String[] args)
    {
        int[] elements = {103, 29, 38, 4, 7, 55, 907, 32};
        hashTableDemo hash1 = new hashTableDemo();
        for (int k : elements)
        {
            hash1.insert(k);
        }
    }
}
