package Java40.thread_study.lesson2.yield;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/2 上午 10:30
 */
public class YieldTest1
{
    //main 主线程与20个线程同时进行
    public static void main(String[] args)
    {
        //创建 20 个线程
        for (int i = 0; i < 20; i++)
        {
            final int finalI = i;
            //子线程休眠 3 秒
            Thread thread = new Thread(() ->
                    System.out.println(finalI + " "));
            thread.start();
            System.out.println();
        }

        System.out.println("OK");
    }
}
