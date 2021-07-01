package Java40.thread_study.lesson3;

import java.time.Instant;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/4 下午 21:07
 */
public class Singleton
{
    private static volatile Singleton instance = null;
    private static Singleton Instance = null;

    //懒汉模式（多线程版 --> 性能高）：二次判断
    public static Singleton getInstance()
    {
        if (instance == null)
        {
            synchronized (Singleton.class)
            {
                if (instance == null)
                {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //懒汉模式（多线程版 --> 性能低）
    public synchronized static Singleton getInstance2()
    {
        if (Instance == null)
        {
            Instance = new Singleton();
        }
        return Instance;
    }

    //懒汉模式（单线程版）：用的时候再new出来
    public static Singleton getInstance1()
    {
        if (Instance == null)
        {
            Instance = new Singleton();
        }
        return Instance;
    }

    //饿汉模式
    public static Singleton getInstance0()
    {
        return Instance;
    }
}
