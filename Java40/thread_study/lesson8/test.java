package Java40.thread_study.lesson8;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/7/1 16:43
 */
public class test
{
    public static synchronized void t1()
    {
        t2();
    }

    public static synchronized void t2()
    {
    }

    public static void main(String[] args)
    {
        t1();
    }
}
