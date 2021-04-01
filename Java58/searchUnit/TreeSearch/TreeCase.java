package Java58.searchUnit.TreeSearch;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/3/31 下午 13:29
 */
public class TreeCase
{
    public static void main(String[] args)
    {
        treeSearch tree = new treeSearch();
        tree.insert(5);

        System.out.println(tree.remove(3)); //false
        System.out.println(tree.remove(5)); //true
        System.out.println(tree.remove(5)); //false

        tree = new treeSearch();
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        System.out.println(tree.remove(3)); //true

        tree = new treeSearch();
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        tree.insert(2);
        System.out.println(tree.remove(3)); //true

        tree = new treeSearch();
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        tree.insert(2);
        tree.insert(4);
        System.out.println(tree.remove(3)); //true

        tree = new treeSearch();
        tree.insert(7);
        tree.insert(8);
        tree.insert(5);
        tree.insert(6);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        System.out.println(tree.remove(5));
        System.out.println(tree.remove(7) + " 7");

        tree = new treeSearch();
        System.out.println(tree.remove(0));
    }

    public static void main1(String[] args)
    {
        treeSearch tree = new treeSearch();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(9);
        tree.insert(10);
        tree.insert(2);
        tree.insert(0);
        tree.insert(8);
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);

        for (int i = -1; i <= 11; i++)
        {
            System.out.println(i + ":" + tree.search(i));
        }

        System.out.println(new treeSearch().search(10));
    }


}
