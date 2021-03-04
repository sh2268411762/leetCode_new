package 数据结构_OJ;

//Definition for singly-linked list.
//给定一个头结点为 head 的非空单链表，返回链表的中间结点。
//如果有两个中间结点，则返回第二个中间结点。
//class ListNode
//{
//    int val;
//    ListNode next;
//
//    ListNode(int x)
//    {
//        val = x;
//    }
//}
//
//class Solution
//{
//    public ListNode middleNode(ListNode head)
//    {
//        //双指针
//        //快指针每次走两步，慢指针每次走一步
//        //当快指针走到头，慢指针刚好走到中间结点
//        ListNode p = head, q = head;
//        while (q != null && q.next != null)
//        {
//            q = q.next.next;
//            p = p.next;
//        }
//        return p;
//    }
//
//    //先求出长度，再进行查找
//    public ListNode middleNode1(ListNode head)
//    {
//        int len = this.getLength(head) / 2 + 1;
//
//        while ((len - 1) > 0)
//        {
//            head = head.next;
//            len--;
//        }
//        return head;
//    }
//    //求单链表长度
//    public int getLength(ListNode head)
//    {
//        int length = 0;
//        if (head.next != null)
//        {
//            ListNode cur = head;
//            while (cur != null)
//            {
//                length++;
//                cur = cur.next;
//            }
//        }
//        return length;
//    }
//}


public class Test1
{

}
