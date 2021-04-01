package Java58.searchUnit.TreeSearch;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 结点
 * @Date 2021/3/31 下午 13:04
 */
public class Node
{
    public Integer key;
    Node left;
    Node right;

    public Node(Integer k)
    {
        this.key = k;
    }

    @Override
    public String toString()
    {
        return "Node{" +
                "key=" + key +
                '}';
    }
}
