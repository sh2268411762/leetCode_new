package 数据结构_OJ;


//class ListNode
//{
//    int val;
//    ListNode next = null;
//
//    ListNode(int val)
//    {
//        this.val = val;
//    }
//}
//
//class Solution
//{
//    public ListNode deleteDuplication(ListNode pHead)
//    {
//        if (pHead == null || pHead.next == null)
//        {
//            return pHead;
//        }
//        ListNode head = new ListNode(-1);
//        head.next = pHead;
//        ListNode prev = head;
//        ListNode last = head.next;
//
//        while (last != null)
//        {
//            if (last.next != null && last.val == last.next.val)
//            {
//                // 找到最后的一个相同节点
//                while (last.next != null && last.val == last.next.val)
//                {
//                    last = last.next;
//                }
//                prev.next = last.next;
//                last = last.next;
//            } else
//            {
//                prev = prev.next;
//                last = last.next;
//            }
//        }
//        return head.next;
//    }
//
//    public ListNode deleteDuplication2(ListNode pHead)
//    {
//        ListNode newHead = new ListNode(-1);
//        ListNode temp = newHead;
//        ListNode cur = pHead;
//
//        while (cur != null)
//        {
//            if (cur.next != null && cur.val == cur.next.val)
//            {
//                while (cur.next != null && cur.val == cur.next.val)
//                {
//                    cur = cur.next;
//                }
//                cur = cur.next;
//            } else
//            {
//                temp.next = cur;
//                temp = cur;
//                cur = cur.next;
//            }
//        }
//        temp.next = null;
//        return newHead.next;
//    }
//}

public class Test5
{
}
