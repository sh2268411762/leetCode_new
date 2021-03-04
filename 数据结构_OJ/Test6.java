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
//class PalindromeList
//{
//    public boolean chkPalindrome(ListNode A)
//    {
//        // write code here
//        if (A == null || A.next == null)
//        {
//            return true;
//        }
//        ListNode B = new ListNode(A.val);
//        ListNode b = new ListNode(-1);
//        b.next = B;
//
//        ListNode head = A.next;
//        while (head != null)
//        {
//            ListNode temp = new ListNode(head.val);
//            temp.next = b.next;
//            b.next = temp;
//            head = head.next;
//        }
//
//        b = b.next;
//        while (b.next != null && A.next != null)
//        {
//            if (b.val != A.val)
//            {
//                return false;
//            }
//            b = b.next;
//            A = A.next;
//        }
//        return true;
//    }
//}

public class Test6
{
}
