package sjjg_OJ;

//236. 二叉树的最近公共祖先
public class Test25
{
    public boolean search(TreeNode root, TreeNode t)
    {
        if (root == null)
        {
            return false;
        }
        if (root == t)
        {
            return true;
        }
        if (search(root.left, t))
        {
            return true;
        }

        return search(root.right, t);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        if (root == p || root == q)
        {
            return root;
        }

        boolean pInLeft = search(root.left, p);
        boolean qInLeft = search(root.left, q);

        if (pInLeft && qInLeft)
        {
            return lowestCommonAncestor(root.left, p, q);
        }

        if (!pInLeft && !qInLeft)
        {
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}
