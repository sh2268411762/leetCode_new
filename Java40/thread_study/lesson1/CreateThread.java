package Java40.thread_study.lesson1;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/6/1 下午 18:07
 */
public class CreateThread
{
    public static void main(String[] args)
    {
        Runnable r = new Runnable()//任务描述的可执行类：传入线程对象的构造
        {
            @Override
            public void run()   //线程运行态时，执行
            {

            }
        };

        Thread thread = new Thread(r,"子线程A");
        thread.start();

        //合并的代码
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {

            }
        },"子线程B").start();

        //lambda 表达式创建
        new Thread(()->{
            System.out.println("C");    //和在run()方法内写代码一样的效果
        },"子线程C").start();
    }
}
