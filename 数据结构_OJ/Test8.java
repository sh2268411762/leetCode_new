package 数据结构_OJ;

import java.util.Deque;
import java.util.LinkedList;

//给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
//有效字符串需满足：
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
public class Test8
{
    public boolean isValid(String s)
    {
        char[] ch = s.toCharArray();
        Deque<Character> deque = new LinkedList<>();

        for (char c : ch)
        {
            if (c == '(')
            {
                deque.push(')');
            } else if (c == '{')
            {
                deque.push('}');
            } else if (c == '[')
            {
                deque.push(']');
            } else if (deque.isEmpty() || c != deque.pop())
            {
                return false;
            }
        }
        return deque.isEmpty();
    }

    public static void main(String[] args)
    {
        Test8 t = new Test8();
        System.out.println(t.isValid("(())()"));
    }
}
