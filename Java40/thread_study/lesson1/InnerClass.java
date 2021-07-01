package Java40.thread_study.lesson1;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 内部类
 * @Date 2021/5/31 下午 18:28
 */
public class InnerClass
{
    public static void main(String[] args)
    {
        //匿名内部类：重新定义了一个 A 的子类，重写了方法 fun，需要明确调用，才会使用方法
        A a = new A()
        {
            @Override
            public void fun()
            {
                System.out.println("A:fun()-->重写");
            }
        };
        a.fun();
    }


    //静态内部类：和普通类使用没什么区别
    //只是需要明确是哪个类的内部类
    //其他包使用：InnerClass.A
    public static class A
    {
        A()
        {
            System.out.println("A 构造");
        }

        public void fun()
        {
            System.out.println("A:fun()");
        }

    }
}
