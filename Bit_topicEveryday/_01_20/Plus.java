package Bit_topicEveryday._01_20;

import java.util.*;

class ListNode
{
    int val;
    ListNode next = null;

    ListNode(int val)
    {
        this.val = val;
    }
}

public class Plus
{
    public ListNode plusAB(ListNode a, ListNode b)
    {
        ListNode cc = new ListNode(0);
        ListNode c = cc;
        int flag = 0;
        int val = 0;
        int va = 1;
        int sum = 0;
        int ccc = 0;
        while (a != null || b != null || ccc != 0)
        {
            val = (a == null ? 0 : a.val);
            va = (b == null ? 0 : b.val);
            sum = val + va + ccc;
            flag = sum % 10;
            ccc = sum / 10;
            c.next = new ListNode(flag);
            c = c.next;
            a = (a == null ? null : a.next);
            b = (b == null ? null : b.next);
        }
        c.next = null;
        return cc.next;
    }
}

