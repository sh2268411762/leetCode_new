package Java40.thread_study.lesson2;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description Thread常用方法
 * @Date 2021/6/2 上午 10:12
 */
public class ThreadApi
{
    public static void main(String[] args)
    {
        //创建线程
        Runnable r = new Runnable()//任务描述的可执行类：传入线程对象的构造
        {
            @Override
            public void run()   //线程运行态时，执行
            {

            }
        };

        Thread thread = new Thread(r, "子线程");
        thread.start();

        System.out.println("静态方法，作用于当前代码行所在的线程，即当前线程：");
        System.out.println("当前线程组中存活的线程数量：" + Thread.activeCount());
        System.out.println("获取代码行所在的当前线程：" + Thread.currentThread());
        System.out.println("让当前线程休眠：" + 1000);
        System.out.println("当前线程让步（从运行态转变为就绪态）：Thread.yield()");
        Thread.yield();


        System.out.println("\n实例方法，作用于调用的线程对象上：");
        System.out.println("获取线程名：" + thread.getName());
        System.out.println("获取线程优先级（0-10）：" + thread.getPriority());
        System.out.println("线程状态  -->" + thread.getState());
        System.out.println("是否守护线程-->" + thread.isDaemon());
        thread.setDaemon(true);
        System.out.println("设置守护线程：thread.setDaemon(true)");
        System.out.println("-->" + thread.isAlive());
        System.out.println("是否守护线程-->" + thread.isDaemon());


    }
}
