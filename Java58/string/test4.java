package Java58.string;


//内部类：匿名内部类、实例内部类、本地内部类、静态内部类

class OutClass
{
    public static int data1;
    private int data2;

    static class InnerClass
    {
        //实例内部类，可以看成是外部类的实例的成员/方法
        public int data3;
        //实例内部类不能定义静态成员方法，可以将其设为final 静态（在编译期间就可以确定其值）
        //public static int data4;
        public static final int data4 = 10;

        public void dun()
        {
            System.out.println(data4);
            System.out.println(data1);
        }
    }

}


public class test4
{
    public static void main(String[] args)
    {
        //实例化内部类
        OutClass outClass = new OutClass();
        OutClass.InnerClass innerClass = new OutClass.InnerClass();
    }
}
