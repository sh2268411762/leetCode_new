package Java40.thread_study.lesson2.yield;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/2 上午 10:30
 */
public class YieldTest3
{
    //main 主线程与 thread 线程同时进行
    public static void main(String[] args) throws InterruptedException
    {
        //创建 20 个线程
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++)
        {
            int finalI = i;
            Thread t = new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    System.out.println(finalI);
                }
            });
            threads[i] = t;
        }

        //启动 20 个线程
        for (Thread t : threads)
        {
            t.start();
        }
        for (Thread t : threads)
        {
            t.join();
        }
        System.out.println("OK");
    }
}
