package Java40.thread_study.lesson2.state;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 线程状态
 * @Date 2021/6/2 上午 11:02
 */
public class ThreadState
{
    public static void main(String[] args)
    {
        //线程状态是一个枚举类
        for (Thread.State state : Thread.State.values())
        {
            System.out.println(state);
        }
        //NEW           ：初始（创建态）
        //RUNNABLE      ：可运行状态（运行，运行中，就绪）
        //BLOCKED       ：阻塞状态
        //WAITING       ：等待
        //TIMED_WAITING ：超时等待
        //TERMINATED    ：终止
    }
}
