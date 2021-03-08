package Java58.sjjg.DequeDemo;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo
{
    public static void main(String[] args)
    {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addLast(5);
        deque.addLast(6);
        deque.addLast(7);

        //4 3 2 1 5 6 7
        //4 4 7 7 3 3 6 6 2 2 5 5 1 1
        while (!deque.isEmpty()) //queue不为空
        {
            System.out.println(deque.getFirst());
            if (!deque.isEmpty())
            {
                System.out.println(deque.removeFirst());
            }
            if (!deque.isEmpty())
            {
                System.out.println(deque.getLast());
            }
            if (!deque.isEmpty())
            {
                System.out.println(deque.removeLast());
            }
        }
    }
}
