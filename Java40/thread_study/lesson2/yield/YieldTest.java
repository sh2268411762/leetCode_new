package Java40.thread_study.lesson2.yield;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/2 上午 10:30
 */
public class YieldTest
{
    public static void main(String[] args)
    {
        //创建 20 个线程
        for (int i = 0; i < 20; i++)
        {
            final int finalI = i;
            Thread thread = new Thread(() ->
            {
                try
                {
                    Thread.sleep(3000);
                    System.out.println(finalI + " ");
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            });
            thread.start();
            System.out.println();
        }

        System.out.println("OK");
    }
}
