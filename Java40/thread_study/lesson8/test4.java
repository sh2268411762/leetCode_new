package Java40.thread_study.lesson8;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/7/1 17:23
 */
public class test4
{
    public static AtomicInteger AC= new AtomicInteger();

    public static void main(String[] args)
    {
        for (int i = 0; i < 20; i++)
        {
            new Thread(() ->
            {
                for (int j = 0; j < 1000; j++)
                {
                    AC.incrementAndGet();
                }
            }).start();
        }

        while (Thread.activeCount() > 1)
        {
            Thread.yield();
        }
        System.out.println(AC.get());
    }
}
