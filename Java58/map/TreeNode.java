package Java58.map;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/2 下午 16:15
 */
public class TreeNode
{
    String key;
    Integer value;

    TreeNode left;
    TreeNode right;

    public TreeNode(String key, Integer value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "TreeNode{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
