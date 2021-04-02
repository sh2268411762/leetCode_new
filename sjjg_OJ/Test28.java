package sjjg_OJ;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 复制带随机指针的链表
 * @Date 2021/4/2 下午 20:22
 */

class Node
{
    int val;
    Node next;
    Node random;

    public Node(int val)
    {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Test28
{
    public Node copyRandomList(Node head)
    {
        Map<Node, Node> map = new TreeMap<>(
                new Comparator<Node>()
                {
                    @Override
                    public int compare(Node o1, Node o2)
                    {
                        return o1.hashCode() - o2.hashCode();
                    }
                }
        );

        Node newHead = new Node(-1);
        Node newLast = newHead;

        Node cur = head;
        while (cur != null)
        {
            Node newNode = new Node(cur.val);
            newLast.next = newNode;
            newLast = newNode;

            map.put(cur, newNode);

            cur = cur.next;
        }

        Node oldCur = head;
        Node newCur = newHead.next;

        while (oldCur != newCur)
        {
            Node oldRandom = oldCur.random;
            Node newRandom = null;

            if (oldRandom != null)
            {
                newRandom = map.get(oldRandom);
            }
            newCur.random = newRandom;
            oldCur = oldCur.next;
            newCur = newCur.next;
        }
        return newHead.next;
    }
}
