package Java58.set;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description TreeSet 实现
 * @Date 2021/3/31 下午 21:16
 */
public class MyTreeSet implements Set<Integer>
{
    private TreeNode root;
    private int size;

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        return 0 == size;
    }

    @Override
    public boolean contains(Object o)
    {
        Comparable<Integer> comparable = (Comparable<Integer>) o;
        TreeNode cur = root;
        while (cur != null)
        {
            int temp = comparable.compareTo(cur.key);
            if (0 == temp)
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

    @Override
    public Iterator<Integer> iterator()
    {

        return null;
    }

    @Override
    public Object[] toArray()
    {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a)
    {
        return null;
    }

    @Override
    public boolean add(Integer integer)
    {
        if (root == null)
        {
            root = new TreeNode(integer);
            size++;
            return true;
        }
        TreeNode parent = null;
        TreeNode cur = root;

        int temp = 0;
        while (cur != null)
        {
            temp = integer.compareTo(cur.key);
            if (0 == temp)
            {
                return false;
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
        if (temp < 0)
        {
            parent.left = new TreeNode(integer);
        } else
        {
            parent.right = new TreeNode(integer);
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o)
    {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear()
    {
        root = null;
        size = 0;
    }
}
