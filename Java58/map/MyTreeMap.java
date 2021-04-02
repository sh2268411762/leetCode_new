package Java58.map;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/2 下午 16:14
 */
public class MyTreeMap
{
    private TreeNode root;

    @Override
    public String toString()
    {
        return "MyTreeMap{" +
                "root=" + root +
                '}';
    }

    public Integer put(String key, Integer value)
    {
        if (root == null)
        {
            root = new TreeNode(key, value);
            return null;
        }

        TreeNode cur = root;
        TreeNode parent = null;
        while (cur != null)
        {
            int cmp = key.compareTo(cur.key);
            if (0 == cmp)
            {
                Integer oldValue = cur.value;
                cur.value = value;
                return oldValue;
            } else if (cmp < 0)
            {
                parent = cur;
                cur = cur.left;
            } else
            {
                parent = cur;
                cur = cur.right;
            }
        }

        TreeNode node = new TreeNode(key, value);
        int cmp = key.compareTo(parent.key);
        if (cmp < 0)
        {
            parent.left = node;
        } else
        {
            parent.right = node;
        }
        return null;
    }

    public Integer get(String key)
    {
        TreeNode cur = root;
        while (cur != null)
        {
            int cmp = key.compareTo(cur.key);
            if (0 == cmp)
            {
                return cur.value;
            } else if (cmp < 0)
            {
                cur = cur.left;
            } else
            {
                cur = cur.right;
            }
        }
        return null;
    }

    public Integer getOrDefault(String key, Integer defaultValue)
    {
        Integer v = get(key);
        if (v != null)
        {
            return v;
        }

        return defaultValue;
    }

}
