package Java58.Tree;


import java.util.LinkedList;
import java.util.Queue;

//对 root 为根的数进行遍历
//
public class TreeTraversal
{
    static int temp = 0;    //修改
    void 逆置()
    {}

    static void change(TreeNode root)   //前序遍历修改
    {
        if (root != null)
        {
            temp++;
            if (temp == 5)
            {
                root.val = 'Z';
            }
            change(root.left);
            change(root.right);
        }
    }


    // 前序遍历
    static void preOrderTraversal(TreeNode root)
    {
        if (root != null)
        {
            //1、首先处理根节点
            System.out.printf("%c ", root.val);
            //2、按照前序处理方式，处理该节点的左子树
            preOrderTraversal(root.left);
            //3、按照前序处理方式，处理该节点的右子树
            preOrderTraversal(root.right);
        }
    }

    // 中序遍历
    static void inOrderTraversal(TreeNode root)
    {
        if (root != null)
        {
            //中序遍历左子树
            inOrderTraversal(root.left);
            //根节点
            System.out.printf("%c ", root.val);
            //中序遍历右子树
            inOrderTraversal(root.right);
        }
    }

    // 后序遍历
    static void postOrderTraversal(TreeNode root)
    {
        if (root != null)
        {
            //后序遍历左子树
            postOrderTraversal(root.left);
            //后序遍历右子树
            postOrderTraversal(root.right);
            //根节点
            System.out.printf("%c ", root.val);
        }
    }

    // 遍历思路-求结点个数

    static int size = 0;

    static int getSize1(TreeNode root)
    {
        size = 0;
        preOrderTraversal1(root);
        return size;
    }

    static void preOrderTraversal1(TreeNode root)   //前序查看结点数
    {
        if (root != null)
        {
            size++;
            preOrderTraversal1(root.left);
            preOrderTraversal1(root.right);
        }
    }

    // 子问题思路-求结点个数
    // 汇集
    static int getSize2(TreeNode root)
    {
        if (root != null)
        {
            //左子树 + 右子树 + 根结点的个数（1）
            return getSize2(root.left) + getSize2(root.right) + 1;
        }
        return 0;
    }


    // 子问题思路-求叶子结点个数
    static int getLeafSize1(TreeNode root)
    {
        int sum = 0;
        if (root != null)
        {
            if (root.left == null && root.right == null)
            {
                sum++;
            }
            return sum + getLeafSize1(root.left) + getLeafSize1(root.right);
        }
        return 0;
    }

    // 遍历思路-求叶子结点个数
    static int leafSize = 0;

    static int getLeafSize2(TreeNode root)
    {
        leafSize = 0;
        preOrderTraversal2(root);
        return leafSize;
    }

    static void preOrderTraversal2(TreeNode root)   //前序查看叶子结点数
    {
        if (root != null)
        {
            if (root.left == null && root.right == null)
            {
                leafSize++;
            }
            preOrderTraversal2(root.left);
            preOrderTraversal2(root.right);
        }
    }


    // 子问题思路-求第 k 层结点个数
    static int getKLevelSize(TreeNode root, int k)
    {
        if (root == null)
        {
            return 0;
        } else if (k == 1)
        {
            return 1;
        } else
        {
            int leftK = getKLevelSize(root.left, k - 1);
            int rightK = getKLevelSize(root.right, k - 1);
            return leftK + rightK;
        }
    }

    // 获取二叉树的高度
    static int getHeight(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        } else
        {
            int leftH = getHeight(root.left);
            int rightH = getHeight(root.right);

            return Math.max(leftH, rightH) + 1;
        }
    }

    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    static boolean find(TreeNode root, int val)
    {
        if (root == null)   //树为空
        {
            return false;
        }
        if (root.val == val)    //判断根
        {
            return true;
        }
        boolean flag = find(root.left, val);    //判断左子树
        if (flag)
        {
            return true;
        }
        return find(root.right, val);   //判断右子树
    }

    static TreeNode find1(TreeNode root, int val)
    {
        if (root == null)   //树为空
        {
            return null;
        }
        if (root.val == val)    //判断根
        {
            return root;
        }
        TreeNode leftF = find1(root.left, val);    //判断左子树
        if (leftF != null)
        {
            return leftF;
        }
        return find1(root.right, val);   //判断右子树
    }

    //查找树中是否有某结点
    static boolean find2(TreeNode root, TreeNode node)
    {
        if (root == null)
        {
            return false;
        }

        if (root == node)
        {
            return true;
        }

        boolean leftF = find2(root.left, node);
        if (leftF)
        {
            return true;
        }

        return find2(root.right, node);
    }

    // 层序遍历
    static void levelOrderTraversal(TreeNode root)
    {
        if (root == null)
        {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty())
        {
            TreeNode node = queue.remove();

            System.out.printf("%c ", node.val);
            if (node.left != null)
            {
                queue.add(node.left);
            }
            if (node.right != null)
            {
                queue.add(node.right);
            }
        }
    }

    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(TreeNode root)
    {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (true)
        {
            TreeNode node = queue.remove();
            if (node == null)
            {
                break;
            }

            queue.add(node.left);
            queue.add(node.right);
        }

        while (!queue.isEmpty())
        {
            TreeNode node = queue.remove();
            if (node == null)
            {

            } else
            {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        TreeNode g = new TreeNode('G');
        TreeNode h = new TreeNode('H');
        TreeNode i = new TreeNode('I');
        TreeNode j = new TreeNode('J');
        TreeNode k = new TreeNode('K');
        TreeNode l = new TreeNode('L');
        TreeNode m = new TreeNode('M');
        TreeNode n = new TreeNode('N');

        //连接
        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        d.right = h;

        f.left = i;
        f.right = j;

        g.right = k;

        h.right = l;

        j.left = m;

        m.left = n;

        System.out.printf("%s", "前序遍历：");
        preOrderTraversal(a);
        System.out.println();

        System.out.printf("%s", "中序遍历：");
        inOrderTraversal(a);
        System.out.println();

        System.out.printf("%s", "后序遍历：");
        postOrderTraversal(a);
        System.out.println();

        System.out.println("树的结点数：" + getSize1(a));
        System.out.println("树的结点数：" + getSize2(a));
        System.out.println("树的叶子结点数：" + getLeafSize2(a));
        System.out.println("树的叶子结点数：" + getLeafSize1(a));
        System.out.println("第1层结点数：" + getKLevelSize(a, 1));
        System.out.println("第2层结点数：" + getKLevelSize(a, 2));
        System.out.println("第3层结点数：" + getKLevelSize(a, 3));
        System.out.println("第4层结点数：" + getKLevelSize(a, 4));
        System.out.println("第5层结点数：" + getKLevelSize(a, 5));
        System.out.println("第6层结点数：" + getKLevelSize(a, 6));
        System.out.println("第7层结点数：" + getKLevelSize(a, 7));
        System.out.println("二叉树的高度：" + getHeight(a));
        System.out.println("是否有 A：" + find(a, 'A'));
        System.out.println("是否有 B：" + find(a, 'B'));
        System.out.println("是否有 B：" + find(a, 'I'));
        System.out.println("是否有 Z：" + find(a, 'Z'));


        System.out.printf("层序遍历：");
        levelOrderTraversal(a);
        System.out.println();


        change(a);
        System.out.println("修改：");
        System.out.printf("%s", "前序遍历：");
        preOrderTraversal(a);
        System.out.println();

        System.out.printf("%s", "中序遍历：");
        inOrderTraversal(a);
        System.out.println();

        System.out.printf("%s", "后序遍历：");
        postOrderTraversal(a);
        System.out.println();
    }
}
