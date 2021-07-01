package Java40.thread_study.lesson2.stop;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 中断
 * @Date 2021/6/2 上午 11:32
 */
public class InterruptTest
{
    public static void main(String[] args)
    {
        Thread thread = new Thread(() ->
        {
            //执行一个任务，时间长
            for (int i = 0; i < 10000 && !Thread.currentThread().isInterrupted(); i++)
            {
                System.out.print(i + " ");
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        System.out.println("t --> start");

        //执行了五秒还未结束
        try
        {
            Thread.sleep(5000);

            thread.interrupt(); //告诉线程要进行中断（设置 t 线程的中断标志位为true，最初为false
            //由 t 中的代码决定是否被中断
            System.out.println("t --> stop");
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
