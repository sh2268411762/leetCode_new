package Java58.sjjg;

class Node1
{
    public int val;
    public Node1 next;
}


//逆置链表
public class ListReverse
{
    public static Node1 reverse(Node1 head)
    {
        Node1 cur = head;
        Node1 curPrev = null;
        Node1 temp = cur;

        while (cur != null)
        {
            if (cur.next == null)
            {
                temp = cur;
            }

            Node1 curNext = cur.next;
            cur.next = curPrev;
            curPrev = cur;
            cur = curNext;
        }

        return temp;
    }

    public static void main(String[] args)
    {
        Node1 head = new Node1();
        head.val = 1;
        head.next = new Node1();
        head.next.val = 2;
        head.next.next = new Node1();
        head.next.next.val = 3;
        head.next.next.next = new Node1();
        head.next.next.next.val = 4;

        Node1 reverseHead = reverse(head);

        Node1 cur = reverseHead;
        while (cur != null)
        {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
    }
}
