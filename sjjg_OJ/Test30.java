package sjjg_OJ;

import java.util.TreeMap;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/7 下午 21:12
 */

class TreeNode
{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val)
    {
        this.val = val;
    }
}

public class Test30
{
    public static void main(String[] args)
    {
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);

        n5.left = n3;
        n5.right = n7;
        n3.left = n1;
        n3.right = n4;
        n7.right = n8;

        TreeNode head = new Test30().Convert(n5);

        TreeNode current = head;
        while (current != null)
        {
            System.out.print(current.val + " ");
            current = current.right;
        }

        TreeNode last = head;
        while (last.right != null)
        {
            last = last.right;
        }

        System.out.println("\n==================");
        current = last;
        while (current != null)
        {
            System.out.print(current.val + " ");
            current = current.left;
        }
    }

    public TreeNode Convert(TreeNode pRootOfTree)
    {
        inorder(pRootOfTree);
        return head;
    }

    private TreeNode last;
    private TreeNode head;

    public Test30()
    {
        this.last = null;
        this.head = null;
    }

    private void inorder(TreeNode node)
    {
        if (node != null)
        {
            inorder(node.left);
            if (last != null)
            {
                last.right = node;
            } else
            {
                head = node;
            }
            node.left = last;
            last = node;
            inorder(node.right);
        }
    }
}
