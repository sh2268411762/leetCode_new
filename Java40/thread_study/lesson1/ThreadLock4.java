package Java40.thread_study.lesson1;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/5/31 下午 18:52
 */
public class ThreadLock4
{
    public static void main(String[] args)
    {
        //创建线程的方式1：使用Thread类，重写run()
        //main 线程中：new 了线程对象，匿名内部类 Thread 子类重写run()
        Thread t = new Thread("main中的子线程")
        {
            @Override
            public void run()
            {

            }
        };

        t.start();
        System.out.println("线程ID    --> " + t.getId());
        System.out.println("线程名    --> " + t.getName());
        System.out.println("线程优先级 --> " + t.getPriority());
        System.out.println("线程状态  -->" + t.getState());
        System.out.println("-->" + t.isAlive());
        System.out.println("是否守护线程-->" + t.isDaemon());
        System.out.println(" " + t.isInterrupted());
    }
}
