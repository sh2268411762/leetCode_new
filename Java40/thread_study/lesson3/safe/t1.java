package Java40.thread_study.lesson3.safe;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/4 下午 20:07
 */
public class t1 implements Runnable
{
    public int STUDENT = 0;
    public int seat = 50;

    @Override
    public void run()
    {
        for (int i = 0; i < 50; i++)
        {
            synchronized (this)
            {
                if (this.seat > 0)
                {
                    System.out.println(Thread.currentThread().getName() + "安排" + this.STUDENT++
                            + "号" + "学生坐在" + this.seat-- + "号座位");
                }
                try
                {
                    Thread.sleep(200);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
