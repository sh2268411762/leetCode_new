package Java40.thread_study.lesson3.UnsafeThread;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/2 下午 17:40
 */
public class unsafeThreadTest
{
    //有一个 count=0 ，同时启动 20 个线程，每个循环 1000 次，每次循环 COUNT++
    private static int COUNT = 0;

    public static void main(String[] args) throws InterruptedException
    {
        Thread[] threads = new Thread[20];
        //将 20 个线程放进数组
        for (int i = 0; i < 20; i++)
        {
            threads[i] = new Thread(() ->
            {
                for (int j = 0; j < 1000; j++)
                {
                    COUNT++;
                }
            });
        }

        //20 个线程同时执行
        for (Thread t : threads)
        {
            t.start();
        }

        //阻塞等待所有 20个线程执行完
        for (Thread t : threads)
        {
            t.join();
        }

        System.out.println(COUNT);
    }
}
