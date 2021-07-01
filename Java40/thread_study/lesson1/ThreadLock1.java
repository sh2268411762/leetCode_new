package Java40.thread_study.lesson1;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/5/31 下午 18:52
 */
public class ThreadLock1
{
    public static void main(String[] args)
    {
        //创建线程的方式1：使用Thread类，重写run()
        //main 线程中：new 了线程对象，匿名内部类 Thread 子类重写run()
        Thread t = new Thread()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    System.out.println("thread()");
                }
            }
        };

        //线程启动，必须使用 start -->启动调度
        //申请系统调度，必须有创建太 --> 就绪态，什么时候变为运行态（由系统决定）
        t.start();
        while(true)
        {
            System.out.println("main()");
        }
    }
}
