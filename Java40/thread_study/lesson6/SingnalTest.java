package Java40.thread_study.lesson6;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/6 下午 16:43
 */
public class SingnalTest
{
    public static void main(String[] args) throws InterruptedException
    {
        //SingnalTest.class.wait();   //未加锁会报错：非法的监视器

        //竞争对象锁
        synchronized (SingnalTest.class)
        {
//            //当前线程释放对像锁
//            SingnalTest.class.wait();

            //通知调用同一个对象的wait（）阻塞的进程(唤醒)，唤醒后竞争对象锁
            SingnalTest.class.notify();
        }//释放对象锁
    }
}
