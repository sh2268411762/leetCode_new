package Bit_topicEveryday._11_26;

import java.util.Stack;

//完成push和pop工作
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int ret;
        if(stack1.empty() && stack2.empty())
        {
            System.out.println("stack1与stack2都为空");
        }
        if(stack2.empty())  //栈2为空
        {
            while(!stack1.empty())//栈1不为空
            {
                stack2.push(stack1.pop());
            }
        }
        ret=stack2.pop();
        return ret;
    }
}
