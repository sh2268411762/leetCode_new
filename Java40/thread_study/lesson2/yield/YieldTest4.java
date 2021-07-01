package Java40.thread_study.lesson2.yield;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/2 上午 10:30
 */
public class YieldTest4
{
    //main 主线程与 thread 线程同时进行
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread = new Thread(() ->
                System.out.println("thread"));
        thread.start();
        thread.join();  //当前线程无条件等待，直到 thread 线程执行完毕，当前线程在往后执行

        //main 正处于运行态，所以很快执行后续代码
        //而 thread 还需要调用 start 调度来进入就绪态，再有系统决定什么时候转变为运行态
        System.out.println("OK");
    }
}
