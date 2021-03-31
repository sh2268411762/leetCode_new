package sjjg_OJ;


import java.util.LinkedList;
import java.util.List;

//class TreeNode
//{
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode()
//    {
//    }
//
//    TreeNode(int val)
//    {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right)
//    {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}



//二叉树遍历
public class Test15
{
    public List<Integer> preorderTraversal(TreeNode root)
    {
        List<Integer> ret = new LinkedList<>();
        fun(root, ret);
        return ret;
    }

    public static void fun(TreeNode root, List<Integer> list)
    {
        if (root != null)
        {
            list.add(root.val);
            fun(root.left, list);
            fun(root.right, list);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new LinkedList<>();
        func(root, ret);
        return ret;
    }

    public static void func(TreeNode root, List<Integer> list)
    {
        if (root != null)
        {
            func(root.left, list);
            list.add(root.val);
            func(root.right, list);
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new LinkedList<>();
        function(root, ret);
        return ret;
    }

    public static void function(TreeNode root, List<Integer> list)
    {
        if (root != null)
        {
            function(root.left, list);
            function(root.right, list);
            list.add(root.val);
        }
    }
}
