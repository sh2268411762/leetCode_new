package Java58.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description treeSet
 * @Date 2021/3/31 下午 20:24
 */
public class setDemo
{
    public static void main(String[] args)
    {
        Set<String> set = new TreeSet<>();

        System.out.println(set.add("apple"));
        System.out.println(set.add("peach"));
        System.out.println(set.add("banana"));
        System.out.println(set.add("orange"));

        System.out.println(set.size());         //4
        System.out.println(set);    //a b o p

        System.out.println(set.add("apple"));       //f
        System.out.println(set.contains("watermelon"));  //f
        System.out.println(set.contains("apple"));       //t
        System.out.println(set.size());             //4
        System.out.println(set);       //a b o p w

        System.out.println();
        System.out.println(set.remove("watermelon"));   //f
        System.out.println(set.remove("apple"));        //t
        System.out.println(set.size());                    //3
        System.out.println(set);                           // b o p


        for (String fruit : set)
        {
            System.out.println(fruit);
        }
        System.out.println(set.isEmpty());
        set.clear();
    }
}
