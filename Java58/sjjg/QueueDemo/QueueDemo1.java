package Java58.sjjg.QueueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");

        System.out.println(queue.element());
        System.out.println(queue.element());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        if (!queue.isEmpty())
        {
            System.out.println(queue.remove());
        }

        if (!queue.isEmpty())
        {
            System.out.println(queue.remove());
        } else
        {
            System.out.println(true);
        }
    }

    public static void main1(String[] args)
    {
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        System.out.println(queue.peek());//看一下
        System.out.println(queue.peek());
        System.out.println(queue.poll());//看一下然后删掉
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
