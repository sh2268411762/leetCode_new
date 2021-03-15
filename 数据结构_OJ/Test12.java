package 数据结构_OJ;


import java.util.Deque;
import java.util.LinkedList;

//实现最小栈
public class Test12
{
    private Deque<Integer> stack;
    private Deque<Integer> Min;

    public Test12()
    {
        stack = new LinkedList<>();
        Min = new LinkedList<>();
    }

    public void push(Integer x)
    {
        stack.push(x);  //将 x 压入普通栈

        if (Min.isEmpty())  //如果最小栈为空，将 x 压入最小栈
        {
            Min.push(x);
        } else
        {
            if (x <= Min.peek()) //如果 x 小于最小栈栈顶元素,则将 x 压入最小栈
            {
                Min.push(x);
            } else
            {
                Min.push(Min.peek());
            }
        }
    }

    public void pop()
    {
        stack.pop();
        Min.pop();
    }

    public Integer top()
    {
        return stack.peek();
    }

    public Integer getMin()
    {
        return Min.peek();
    }
}
