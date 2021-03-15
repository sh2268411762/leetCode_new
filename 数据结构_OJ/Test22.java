package 数据结构_OJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TreeNode1
{
    char val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1()
    {
    }

    TreeNode1(char val)
    {
        this.val = val;
    }

    TreeNode1(char val, TreeNode1 left, TreeNode1 right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

//二叉树的遍历
public class Test22
{
    public static TreeNode1 buildTree(List<Character> in, List<Character> out)
    {
        if (in.isEmpty())
        {
            return null;
        }

        char rootVal = in.remove(0);
        if (rootVal == '#')
        {
            out.addAll(in);
            return null;
        }

        TreeNode1 root = new TreeNode1(rootVal);

        List<Character> rightOut = new ArrayList<>();
        TreeNode1 leftT = buildTree(in, rightOut);

        TreeNode1 rightT = buildTree(rightOut, out);
        root.left = leftT;
        root.right = rightT;

        return root;
    }

    // 中序遍历
    static void inOrderTraversal(TreeNode1 root)
    {
        if (root != null)
        {
            //中序遍历左子树
            inOrderTraversal(root.left);
            //根节点
            System.out.printf("%c ", root.val);
            //中序遍历右子树
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext())
        {
            String str = sc.next();
            List<Character> root = new ArrayList<>();
            for (int i = 0; i < str.length(); i++)
            {
                root.add(str.charAt(i));
            }
            TreeNode1 ret = buildTree(root, new ArrayList<>());
            inOrderTraversal(ret);
            System.out.println();
        }
    }
}
