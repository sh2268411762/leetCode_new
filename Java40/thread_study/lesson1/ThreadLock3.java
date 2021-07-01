package Java40.thread_study.lesson1;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/5/31 下午 18:52
 */
public class ThreadLock3
{
    public static void main(String[] args)
    {
        Thread t = new Thread()
        {
            @Override
            public void run()   //在多线程环境下，即使同一个代码块，也是可以并发并行执行的
            {
                for (int i = 0; i < 10000; i++) //线程的 i
                {
                    //线程中，处理异常的方式：线程对象， t.setUncaughtExceptionHandler()
                    //或者自己在 run 方法中进行捕获并处理
                    if (20 == i)
                    {
                        throw new RuntimeException();
                    }
                    System.out.print(i + " ");
                }
            }
        };
        t.start();
        while (true)
        {
            System.out.println("main()");
        }
    }
}
