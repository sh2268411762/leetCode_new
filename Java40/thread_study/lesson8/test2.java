package Java40.thread_study.lesson8;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 锁粗化:静态变量属于方法区，jdk1.8后是在堆里边，线程共享
 * @Date 2021/7/1 16:58
 */
public class test2
{
    private static final StringBuffer sb = new StringBuffer();

    public static void main(String[] args)
    {
        sb.append("a");
        sb.append("b");
        sb.append("c");

        System.out.println(sb);
    }
}
