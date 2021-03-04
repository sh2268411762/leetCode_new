package Java58.string;

public class Test5
{
    public int data1 = 999;
    private int data2;
    public static int data3;

    //静态内部类
    static class InnerClass2
    {
        public int data4 = 999;
        private int data5;
        public static int data6;

        public void fun()
        {
            System.out.println("静态内部类");
        }
    }

    //实例化静态内部类:Test5.InnerClass2 I2 = new Test5.InnerClass2();
    //静态内部类不能访问外部类的实例数据成员,可以用外部类的对象的引用
    public static void main(String[] args)
    {
        Test5.InnerClass2 I2 = new Test5.InnerClass2();
    }
}
