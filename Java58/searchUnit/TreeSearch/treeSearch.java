package Java58.searchUnit.TreeSearch;

import org.jetbrains.annotations.NotNull;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 搜索二叉树
 *              查找中比较次数和高度有关（logn(n) - n) 之间变换
 * @Date 2021/3/31 下午 13:04
 */
public class treeSearch
{
    public Node root;

    public treeSearch()
    {
        this.root = null;
    }

    public boolean search(Integer k)
    {
        Node cur = root;

        while (cur != null)
        {
            int temp = k.compareTo(cur.key);
            if (temp == 0)
            {
                return true;
            } else if (temp < 0)
            {
                cur = cur.left;
            } else
            {
                cur = cur.right;
            }
        }
        return false;
    }

    public void insert(Integer k)
    {
        if (root == null)
        {
            root = new Node(k);
            return;
        }
        //cur
        Node cur = root;
        Node prev = null;
        int temp = k.compareTo(cur.key);

        while (cur != null)
        {
            if (temp == 0)
            {
                throw new RuntimeException("treeSearch 中不允许出现相同的结点");
            } else if (temp < 0)
            {
                prev = cur;
                cur = cur.left;
            } else
            {
                prev = cur;
                cur = cur.right;
            }
        }

        //cur == null
        //prev 就是要插入节点的双亲
        Node node = new Node(k);
        if (temp < 0)
        {
            prev.left = node;
        } else
        {
            prev.right = node;
        }
    }

    //替换删除（选择左子树中最大的一个或右子树中最小的一个来替换）
    //1、查找包含 k 的结点，基座 node，父节点为 parent
    //2、判断：
    //
    public boolean remove(Integer k)
    {
        //查找
        Node parent = null;
        Node cur = root;


        while (cur != null)
        {
            int temp = k.compareTo(cur.key);
            if (temp == 0)
            {
                removeInternal(cur, parent);
                return true;
            } else if (temp < 0)
            {
                parent = cur;
                cur = cur.left;
            } else
            {
                parent = cur;
                cur = cur.right;
            }
        }
        return false;
    }

    private void removeInternal(@NotNull Node cur, Node parent)
    {
        if (cur.left == null && cur.right == null)
        {
            if (cur == root)
            {
                root = null;
            } else if (cur == parent.left)
            {
                parent.left = null;
            } else
            {
                parent.right = null;
            }
        } else if (cur.left != null && cur.right == null)
        {
            if (cur == root)
            {
                root = cur.left;
            } else if (cur == parent.left)
            {
                parent.left = cur.left;
            } else
            {
                parent.right = cur.left;
            }
        } else if (cur.left == null && cur.right != null)
        {
            if (root == cur)
            {
                root = cur.right;
            } else if (cur == parent.left)
            {
                parent.left = cur.right;
            } else
            {
                parent.right = cur.right;
            }
        } else
        {
            //左子树中最大值
            Node ghostParent = cur;
            Node ghost = cur.left;

            while (ghost.right != null)
            {
                ghostParent = ghost;
                ghost = ghost.right;
            }

            //1、替换
            cur.key = ghost.key;
            //删除ghost 结点
            if (cur == ghostParent)
            {
                ghostParent.left = ghost.left;
            } else
            {
                ghostParent.right = ghost.left;
            }
        }
    }
}
