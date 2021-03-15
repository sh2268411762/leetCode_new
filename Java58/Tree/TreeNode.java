package Java58.Tree;


public class TreeNode
{
    int val;
    TreeNode left;  //左子树
    TreeNode right; //右子树

    public TreeNode(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString()
    {
        return String.format("%c", val);
    }
}
