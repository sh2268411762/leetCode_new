package 数据结构_OJ;


import java.util.LinkedList;
import java.util.Queue;

//用队列实现栈
public class Test9
{
    private Queue<Integer> q1;  //输入
    private Queue<Integer> q2;  //输出

    /**
     * Initialize your data structure here.
     */
    public Test9()
    {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(Integer x)
    {
        q1.offer(x);
        //将 q2 中的元素插入 q1
        while (!q2.isEmpty())    //q2 不为空
        {
            q1.offer(q2.poll());
        }
        //交换两个队列，使 q1 在没有插入时始终为空队列
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public Integer pop()
    {
        return q2.poll();
    }

    /**
     * Get the top element.
     */
    public Integer top()
    {
        return q2.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty()
    {
        return q2.isEmpty();
    }
}
