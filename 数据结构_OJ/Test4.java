package 数据结构_OJ;


////链表分割
////现有一链表的头指针 ListNode* pHead，给一定值x，编写一段代码将所有小于x的结点排在其余结点之前，
//// 且不能改变原来的数据顺序，返回重新排列后的链表的头指针。
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
//class Partition
//{
//    public ListNode partition(ListNode pHead, int x)
//    {
//        ListNode ret1 = null, ret2 = null;
//        ListNode temp1 = null, temp2 = null;
//        ListNode head = pHead;
//
//        while (head != null)
//        {
//            if (head.val < x)
//            {
//                //第一次插入
//                if (ret1 == null)   //确定小链表的头
//                {
//                    ret1 = head;
//                    ret2 = head;
//                } else
//                {
//                    ret2.next = head;
//                    ret2 = ret2.next;
//                }
//            } else
//            {
//                //第一次插入
//                if (temp1 == null)  //确定大链表的头
//                {
//                    temp1 = head;
//                    temp2 = head;
//                } else
//                {
//                    temp2.next = head;
//                    temp2 = temp2.next;
//                }
//            }
//            head = head.next;
//        }
//        if (ret1 == null)   //说明没有比x小的结点
//        {
//            return temp1;   //返回大链表
//        }
//        ret2.next = temp1;  //有小链表，将大链表拼接到小链表后
//        if (temp1 != null)  //t1不为空，即有大节点接入
//        {
//            temp2.next = null;  //尾部置空
//        }
//        return ret1;
//    }
//}

public class Test4
{
}
