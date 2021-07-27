package Java40.JVM;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/7/20 19:22
 */
public class Child extends Parent
{
    private static String s = "abc";
    private String o = "def";

    //静态代码块
    static
    {
        System.out.println("Child static block");
    }

    //实例代码块
    {
        System.out.println("child block");
    }


    public Child()
    {
        System.out.println("Child constructor");
    }
}
