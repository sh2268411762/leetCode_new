//package 数据结构_OJ;
//
//
///**
// * Definition for singly-linked list.
// */
//class ListNode
//{
//    int val;
//    ListNode next;
//
//    ListNode(int x)
//    {
//        val = x;
//        next = null;
//    }
//}
//
//class Solution
//{
//    public boolean hasCycle(ListNode head)
//    {
//        ListNode fast = head;   //快指针一次走两步
//        ListNode slow = head;   //慢指针一次走一步
//
//        while (fast != null && fast.next != null)
//        {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (slow == fast)
//            {
//                return true;
//            }
//        }
//        return false;
//    }
//}
//
//public class Test7
//{
//}
