package Java58.string;

//匿名内部类


class OutClass3
{
    public void func()
    {
        System.out.println("OutClass3的func");
    }
}
public class Test6
{
    public static void main(String[] args)
    {
        new OutClass3()
        {
            public int data1;
            public void func()
            {
                System.out.println("重写");
            }

        }.func();
    }
}
