package 数据结构_OJ;


import java.util.List;
////合并两个有序链表
////  Definition for singly-linked list.
//class ListNode
//{
//    int val;
//    ListNode next;
//
//    ListNode()
//    {
//    }
//
//    ListNode(int val)
//    {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next)
//    {
//        this.val = val;
//        this.next = next;
//    }
//}
//
//class Solution
//{
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
//    {
//        if(l1==null && l2 == null)
//        {
//            return null;
//        }
//        if(l1 == null)
//        {
//            return l2;
//        }
//        if(l2 == null)
//        {
//            return l1;
//        }
//        ListNode head;
//        if (l2.val < l1.val)
//        {
//            head = new ListNode(l2.val);
//            l2 = l2.next;
//        } else
//        {
//            head = new ListNode(l1.val);
//            l1 = l1.next;
//        }
//        ListNode cur = head;
//
//
//        while (l1 != null && l2 != null)
//        {
//            ListNode temp;
//            if (l2.val < l1.val)
//            {
//                temp = new ListNode(l2.val);
//                l2 = l2.next;
//            } else
//            {
//                temp = new ListNode(l1.val);
//                l1 = l1.next;
//            }
//            cur.next = temp;
//            cur = cur.next;
//        }
//        if (l1 != null)
//        {
//            cur.next = l1;
//        } else
//        {
//            cur.next = l2;
//        }
//        return head;
//    }
//}


public class Test3
{

}
