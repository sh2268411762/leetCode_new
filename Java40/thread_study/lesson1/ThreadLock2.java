package Java40.thread_study.lesson1;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/5/31 下午 18:52
 */
public class ThreadLock2
{
    public static void main(String[] args)
    {
        //同时启动 20 个线程，每个线程从 0 ，用 +1 的方式加到 9999
        for (int i = 0; i < 20; i++)    //main 方法的 i
        {
            Thread t = new Thread()
            {
                @Override
                public void run()   //在多线程环境下，即使同一个代码块，也是可以并发并行执行的
                {
                    for (int i = 0; i < 10000; i++) //线程的 i
                    {
                        if (9999 == i)
                        {
                            System.out.println(i);
                        }
                    }
                }
            };
            t.start();
        }
    }
}
