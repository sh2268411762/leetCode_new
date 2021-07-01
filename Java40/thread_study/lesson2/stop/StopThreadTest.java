package Java40.thread_study.lesson2.stop;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/2 上午 11:25
 */
public class StopThreadTest
{
    public static boolean STOP = false;

    public static void main(String[] args)
    {
        Thread thread = new Thread(() ->
        {
            //执行一个任务，时间长
            for (int i = 0; i < 10000 && !STOP; i++)
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
            STOP = true;
            System.out.println("t --> stop");
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
