package Java40.thread_study.lesson7;

import java.util.concurrent.FutureTask;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/28 13:27
 */
public class TestDemo
{
    public static void main(String[] args) throws Exception
    {
        FutureTask<String> task = new FutureTask<>(new MyThread());
        new Thread(task).start();
        new Thread(task).start();
        System.out.println(task.get());
    }
}
