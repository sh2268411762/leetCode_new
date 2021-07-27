package Java40.JVM;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/7/20 19:22
 */
public class Parent
{
    private static String s = "abc";
    private String o = "def";

    static
    {
        System.out.println("parent static block");
    }

    {
        System.out.println("parent block");
    }

    public Parent()
    {
        System.out.println("parent constructor");
    }
}
