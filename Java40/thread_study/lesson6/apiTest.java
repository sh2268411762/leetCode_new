package Java40.thread_study.lesson6;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 面包店
 * @Date 2021/6/6 下午 16:39
 */
public class apiTest
{
    public static int START;
    public static int END;
    public static int COUNT;

    //消费者
    public static class Consumer implements Runnable
    {
        private final String name;
        //private int count = 10;


        public Consumer(String name)
        {
            this.name = name;
        }

        @Override
        public void run()
        {
            //一直消费
            try
            {
                while (true)
                {
                    synchronized (apiTest.class)
                    {
                        if (START == 900)
                        {
                            break;
                        }
                        if (0 == COUNT)
                        {
                            //库存到达下限，不能继续消费，需要阻塞等待
                            apiTest.class.wait();   //释放对象锁
                        } else
                        {
                            //库存大于0，消费次数大于0，允许消费
//                            if (count > 0)
//                            {
                            System.out.printf("%s 消耗一次消费次数，消费了 1 个面包，消费次数还有[00]次\n", name);
                            COUNT--;

                            END++;
                            //通知由 apiTest.class.wait() 进入阻塞的线程
                            apiTest.class.notifyAll();  //唤醒
                            Thread.sleep(1000);
                            //}
                        }
                    }
                }
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    //生产者
    public static class Producer implements Runnable
    {
        private final String name;
        private int count = 30;

        public Producer(String name)
        {
            this.name = name;
        }

        @Override
        public void run()
        {
            //一直生产
            try
            {
                for (int i = 0; i < 30; i++)
                {
                    synchronized (apiTest.class)
                    {
                        if (COUNT + 3 > 100)
                        {
                            //库存到达上限，不能继续生产，需要阻塞等待
                            apiTest.class.wait();   //释放对象锁
                        } else
                        {
                            //库存满足生产条件，生产次数大于0，进行生产
                            if (count > 0)
                            {
                                System.out.printf("%s消耗一次生产次数，生产了 3 个面包,生产次数还有[%d]次\n", name, --count);
                                COUNT++;

                                START += 3;

                                //通知由 apiTest.class.wait() 进入阻塞的线程
                                apiTest.class.notifyAll();  //唤醒
                                Thread.sleep(500);
                            }
                        }
                    }
                }
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        //同时启动20个消费者线程
        Thread[] consumers = new Thread[20];
        for (int i = 0; i < 20; i++)
        {
            consumers[i] = new Thread(new Consumer("消费者" + i));
        }

        //同时启动10个生产者线程
        Thread[] producers = new Thread[20];
        for (int i = 0; i < 10; i++)
        {
            producers[i] = new Thread(new Producer("生产者" + i));
        }

        for (int i = 0; i < 20; i++)
        {
            consumers[i].start();
        }

        for (int i = 0; i < 10; i++)
        {
            producers[i].start();
        }


        System.out.println(START + " " + END);
    }
}
