package sjjg_OJ;

import java.util.Stack;

public class Test11
{
    private Stack<Integer> a;   //输入栈
    private Stack<Integer> b;   //输出栈

    /**
     * Initialize your data structure here.
     */
    public Test11()
    {
        a = new Stack<>();
        b = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(Integer x)
    {
        a.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public Integer pop()
    {
        //如果 b 为空，则将 a 中的元素压入 b 中
        if (b.isEmpty())
        {
            while (!a.isEmpty())
            {
                b.push(a.pop());
            }
        }
        return b.pop();
    }

    /**
     * Get the front element.
     */
    public Integer peek()
    {
        if (b.isEmpty())
        {
            while (!a.isEmpty())
            {
                b.push(a.pop());
            }
        }
        return b.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty()
    {
        return a.isEmpty() && b.isEmpty();
    }
}
