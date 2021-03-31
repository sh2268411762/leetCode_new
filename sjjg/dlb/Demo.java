package sjjg.dlb;

class Node
{
    public int data;    //数据域
    public Node next;   //地址域  --> 默认为空

    public Node(int _data)
    {
        this.data = _data;
    }   //结点
}
public class Demo
{
    public static Node add(Node head, int e)
    {
        Node cur = new Node(e);
        cur.next = head;
        head = cur;
        return head;
    }

    public static Node addW(Node head, int e)
    {
        Node node = new Node(e);
        if (head == null)
        {
            head = add(head, e);
            return head;
        }

        Node cur = head;
        while (cur.next != null)
        {
            cur = cur.next;
        }
        cur.next = node;
        return head;
    }

    public static Node pop_f(Node head)
    {
        if (head == null)
        {
            return null;
        }

        head = head.next;
        return head;
    }

    public static Node pop_Back(Node head)
    {
        if (head == null || head.next == null)
        {
            return null;
        }

        Node cur = head;
        Node prev = null;
        while (cur.next != null)
        {
            prev = cur;
            cur = cur.next;
        }
        assert prev != null;
        prev.next = null;
        return head;
    }

    public static void disPlay(Node head)
    {
        Node node = head;
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        Node head = null;
        head = add(head, 12);
        disPlay(head);
        System.out.println();
        head = add(head, 13);
        head = add(head, 14);
        head = add(head, 15);
        head = add(head, 16);
        disPlay(head);
        System.out.println();

        head = addW(head, 11);
        head = addW(head, 10);
        head = addW(head, 9);
        disPlay(head);
        System.out.println();

        head = pop_f(head);
        disPlay(head);      //15 14 ...
        head = pop_f(head);
        disPlay(head);      //14
        System.out.println();

        head = pop_Back(head);
        disPlay(head);      //14 ... 10
        head = pop_Back(head);
        disPlay(head);      //14 ... 11
    }
}
