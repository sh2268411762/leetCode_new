package sjjg_OJ;

//平衡二叉树
public class Test20
{
    public int getHeight(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }

        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public boolean isBalanced(TreeNode root)
    {
        if (root == null)
        {
            return true;
        }

        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);
        int temp = leftH - rightH;

        if (!(temp == -1 || temp == 1 || temp == 0))
        {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }
}
