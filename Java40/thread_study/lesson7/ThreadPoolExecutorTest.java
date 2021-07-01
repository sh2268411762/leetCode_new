package Java40.thread_study.lesson7;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/26 22:19
 */
public class ThreadPoolExecutorTest
{
    public static void main(String[] args)
    {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                5,  //核心线程数 --> 正式员工
                10,     //最大线程数 --> 正式员工 + 临时工
                60,
                TimeUnit.SECONDS,       //（idle 线程的空闲时间）超过一定时间，临时工被干掉
                new LinkedBlockingDeque<>(),//阻塞队列，任务存放的地方（快递仓库）
                new ThreadFactory()
                {
                    @Override
                    public Thread newThread(@NotNull Runnable r)
                    {

                        return new Thread(new Runnable()
                        {
                            @Override
                            public void run()
                            {
                                long start = System.currentTimeMillis();
                                r.run();
                                long end = System.currentTimeMillis();
                                System.out.println("任务执行时间：" + (end - start) + "毫秒");
                            }
                        });
                    }
                },  //创建线程的工厂类：线程池出那个键线程时，调用该工厂的方法创建线程 --> 招聘员工的标准
                new ThreadPoolExecutor.AbortPolicy()
                //拒绝策略：在最大线程数且阻塞队列已满所采取的拒绝策略
                /*
                     拒绝策略：达到最大线程数或阻塞队列已满
                     AbortPolicy:直接抛RejectedExecution(不提供handler时的默认策略)
                     CallerRunsPolicy：谁（某个线程）交给我（线程池）任务，我拒绝执行，由谁自己决定
                     DiscardPolicy:交给我的任务，直接丢弃掉
                     DiscardOldestPolicy：丢弃阻塞队列中最旧的任务
                 */
        );

        for (int i = 0; i < 20; i++)
        {
            //线程池执行任务：execute、submit
            poolExecutor.execute(new Runnable()
            {
                @Override
                public void run()
                {
                    try
                    {
                        Thread.sleep(1000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
