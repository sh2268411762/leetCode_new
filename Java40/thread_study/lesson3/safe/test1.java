package Java40.thread_study.lesson3.safe;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 有一个教室，50个座位，同时有3个老师进行安排，
 * 每个老师安排100个同学到教室
 * 0 --> 49
 * @Date 2021/6/4 下午 20:00
 */
public class test1
{
    public static void main(String[] args) throws InterruptedException
    {
        t1 t = new t1();
        Thread thread1 = new Thread(t, "A");
        Thread thread2 = new Thread(t, "B");
        Thread thread3 = new Thread(t, "C");

        Thread[] threads = new Thread[3];
        threads[0] = thread1;
        threads[1] = thread2;
        threads[2] = thread3;


        for (int i = 0; i < 3; i++)
        {
            threads[i].start();
        }
        for (int i = 0; i < 3; i++)
        {
            threads[i].join();
        }

    }
}
