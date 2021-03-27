package Java58.Tree;


import java.util.LinkedList;
import java.util.Queue;

public class Demo
{
    public static void main(String[] args)
    {

    }

    static int getHeight(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        } else
        {
            int leftH = getHeight(root.left);
            int rightH = getHeight(root.right);

            return Math.max(leftH, rightH) + 1;
        }
    }

    // 层序遍历
    static void levelOrderTraversal(TreeNode root)
    {
        if (root == null)
        {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            TreeNode node = queue.remove();

            System.out.printf("%c", node.val);
            if (node.left != null)
            {
                queue.add(node.left);
            }
            if (node.right != null)
            {
                queue.add(node.right);
            }
        }
    }
}
