package 数据结构_OJ;

//606. 根据二叉树创建字符串
public class Test24
{
    public void preOrder(StringBuilder str, TreeNode node)
    {
        if (node != null)
        {
            str.append(node.val);
            if (node.left == null && node.right == null)
            {
            } else if (node.left != null && node.right == null)
            {

                str.append("(");
                preOrder(str, node.left);
                str.append(")");
            } else
            {
                str.append("(");
                preOrder(str, node.left);
                str.append(")");

                str.append("(");
                preOrder(str, node.right);
                str.append(")");
            }
        }
    }

    public String tree2str(TreeNode t)
    {
        StringBuilder ret = new StringBuilder();

        preOrder(ret, t);
        return ret.toString();
    }
}
