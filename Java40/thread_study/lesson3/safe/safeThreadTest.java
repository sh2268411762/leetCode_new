package Java40.thread_study.lesson3.safe;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 修改为安全线程
 * @Date 2021/6/2 下午 17:40
 */
public class safeThreadTest
{
    //有一个 count=0 ，同时启动 20 个线程，每个循环 1000 次，每次循环 COUNT++
    private static int COUNT = 0;

    public static void main(String[] args) throws InterruptedException
    {
        Class<safeThreadTest> clazz = safeThreadTest.class;
        Thread[] threads = new Thread[20];
        //将 20 个线程放进数组
        for (int i = 0; i < 20; i++)
        {
            threads[i] = new Thread(() ->
            {
                for (int j = 0; j < 1000; j++)
                {
                    //一个进程在使用时其他线程不能使用
                    //synchronized:synchronized 代码块，对一段代码进行加锁操作，同步关键字
                    //让某段代码满足三个特性：原子性，可见性，有序性
                    //原理：多个线程间同步互斥（一段代码在任意一个时间点，只有一个线程执行：加锁/释放锁）
                    //加锁/释放锁：基于对象来进行加锁/释放锁 --> 不是把代码锁住了
                    synchronized (clazz)
                    {
                        COUNT++;
                    }
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
