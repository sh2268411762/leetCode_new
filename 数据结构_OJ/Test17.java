package 数据结构_OJ;

//对称二叉树
public class Test17
{
    public boolean isSymmetric(TreeNode root)
    {
        if (root == null)
        {
            return true;
        }

        return isMirrorTree(root.left, root.right);
    }

    public boolean isMirrorTree(TreeNode p, TreeNode q)
    {
        if (p == null && q == null)
        {
            return true;
        }

        if (p == null || q == null)
        {
            return false;
        }


        return p.val == q.val && isMirrorTree(p.left, q.right) && isMirrorTree(p.right, q.left);
    }
}
