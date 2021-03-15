package 数据结构_OJ;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Test13
{
    private List<Integer> IntArrayToList(int[] array)
    {
        List<Integer> ret = new ArrayList<>();

        for (int j : array)
        {
            ret.add(j);
        }
        return ret;
    }

    public boolean fun1(int[] pushA, int[] popA)
    {
        List<Integer> pushList = IntArrayToList(pushA);
        List<Integer> popList = IntArrayToList(popA);

        Deque<Integer> stack = new LinkedList<>();

        while (!popList.isEmpty())
        {
            int temp = popList.remove(0);

            while (stack.isEmpty() || stack.peek() != temp)
            {
                if (pushList.isEmpty())
                {
                    return false;
                }

                int q = pushList.remove(0);
                stack.push(q);

            }
            stack.pop();
        }
        return stack.isEmpty();
    }

    public boolean fun(int[] pushA, int[] popA)
    {
        List<Integer> pushList = IntArrayToList(pushA);
        List<Integer> popList = IntArrayToList(popA);

        if (pushList.size() != popList.size())
        {
            return false;
        }

        Deque<Integer> stack = new LinkedList<>();

        while (!popList.isEmpty())
        {
            int temp = popList.remove(0);

            while (true)
            {
                if (stack.isEmpty() || stack.peek() != temp)
                {
                    if (pushList.isEmpty())
                    {
                        return false;
                    }

                    int q = pushList.remove(0);
                    stack.push(q);
                } else
                {
                    break;
                }
            }
            stack.pop();
        }
        return stack.isEmpty() && pushList.isEmpty();
    }

}
