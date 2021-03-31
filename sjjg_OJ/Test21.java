package sjjg_OJ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//二叉树的层序遍历
public class Test21
{
    static class NL
    {
        TreeNode node;
        int lever;

        public NL(TreeNode node, int lever)
        {
            this.node = node;
            this.lever = lever;
        }
    }


    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> ret = new ArrayList<>();   //外侧 List
        if (root == null)
        {
            return ret;
        }


        Queue<NL> queue = new LinkedList<>();
        queue.add(new NL(root, 0));
        while (!queue.isEmpty())
        {
            NL nl = queue.remove();
            TreeNode node = nl.node;
            int le = nl.lever;

            System.out.println(le);
            System.out.println(node.val);

            if (le == ret.size())
            {
                ret.add(new ArrayList<>());
            }
            List<Integer> innerList = ret.get(le);
            innerList.add(node.val);

            if (node.left != null)
            {
                queue.add(new NL(node.left, le + 1));
            }
            if (node.right != null)
            {
                queue.add(new NL(node.right, le + 1));
            }
        }
        return ret;
    }
}
