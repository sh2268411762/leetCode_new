package Java40.thread_study.lesson7;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Queue;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 阻塞式队列
 * @Date 2021/6/26 21:36
 */
public class queueTest<T>
{
    //使用数组实现循环队列
    private Object[] queue;

    //存放元素的索引
    private int putIndex;
    //取元素的索引
    private int takeIndex;
    //当前存放元素的数量
    private int size;

    public queueTest(int len)
    {
        queue = new Object[len];
    }

    //存放元素
    //putIndex 超过数组长度
    //size     达到数组最大长度抛异常
    public synchronized void put(T e) throws InterruptedException
    {
        //当阻塞等待到唤醒并再次竞争成功对象锁，回复后往下执行时，条件可能会被其他线程修改
        while (size == queue.length)
        {
            this.wait();
        }
        queue[putIndex] = e;    //存放到数组中放元素的位置
        //存放位置超过数组的最大索引，需要取模放在 0
        putIndex = (putIndex + 1) % queue.length;
        size++;
        notifyAll();    //唤醒被阻塞的进程
    }

    //取元素
    public synchronized T take() throws InterruptedException
    {
        while (size == 0)
        {
            this.wait();
        }
        T t = (T) queue[takeIndex];
        queue[takeIndex] = null;
        takeIndex = (takeIndex + 1) % queue.length;
        size--;
        notifyAll();
        return t;
    }

    public int size()
    {
        return size;
    }

    //多线程的调试：
    //1、写打印语句
    //2、监视(jconsole)
    //3、debug 有时可以
    public static void main(String[] args) throws InterruptedException
    {
        queueTest<Integer> queueTest = new queueTest<>(10);
        for (int i = 0; i < 3; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    for (int j = 0; j < 1000; j++)
                    {
                        try
                        {
                            queueTest.put(j);
                        } catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
        for (int i = 0; i < 3; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    for (; ; )
                    {
                        int t = 0;
                        try
                        {
                            t = queueTest.take();
                        } catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                        System.out.println(t + " " + Thread.currentThread().getName());
                    }
                }
            }).start();
        }

    }
}
