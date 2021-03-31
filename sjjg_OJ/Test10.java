package sjjg_OJ;

import java.util.LinkedList;
import java.util.Queue;

//用队列实现栈
public class Test10
{
    Queue<Integer> queue;

    /**
     * Initialize your data structure here.
     */
    public Test10()
    {
        queue = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(Integer x)
    {
        queue.add(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public Integer pop()
    {
        int size = queue.size();
        for (int i = 0; i < size - 1; i++)
        {
            Integer temp = queue.remove();
            queue.add(temp);
        }
        return queue.remove();
    }

    /**
     * Get the top element.
     */
    public Integer top()
    {
        int size = queue.size();
        for (int i = 0; i < size - 1; i++)
        {
            Integer temp = queue.remove();
            queue.add(temp);
        }
        Integer ret = queue.remove();
        queue.add(ret);
        return ret;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty()
    {
        return queue.isEmpty();
    }
}
