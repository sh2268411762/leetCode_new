package 数据结构_OJ;

import java.util.ArrayList;
import java.util.List;

//从前序与中序遍历序列构造二叉树
public class Test23
{
    public List<Integer> intArrayToList(int[] array)
    {
        List<Integer> list = new ArrayList<>();

        for (int j : array)
        {
            list.add(j);
        }
        return list;
    }

    public TreeNode buildTreeInternal(List<Integer> preorderList, List<Integer> inorderList)
    {
        if (preorderList.isEmpty())
        {
            return null;
        }

        int rootVal = preorderList.get(0);
        TreeNode root = new TreeNode(rootVal);
        if (1 == preorderList.size())
        {
            return root;
        }

        int leftSize = inorderList.indexOf(rootVal);


        List<Integer> leftPre = preorderList.subList(1, 1 + leftSize);
        List<Integer> rightPre = preorderList.subList(1 + leftSize, preorderList.size());


        List<Integer> leftIn = inorderList.subList(0, leftSize);
        List<Integer> rightIn = inorderList.subList(leftSize + 1, inorderList.size());

        root.left = buildTreeInternal(leftPre, leftIn);
        root.right = buildTreeInternal(rightPre, rightIn);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
        List<Integer> preorderList = intArrayToList(preorder);
        List<Integer> inorderList = intArrayToList(inorder);

        return buildTreeInternal(preorderList, inorderList);
    }
}
