package Java40.thread_study.lesson7;

import java.util.concurrent.Callable;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/28 13:25
 */
class MyThread implements Callable<String>
{
    private int ticket = 10; // 一共10张票

    @Override
    public String call() throws Exception
    {
        while (this.ticket > 0)
        {
            System.out.println("剩余票数：" + this.ticket--);
        }
        return "票卖完了，下次吧。。。";
    }
}