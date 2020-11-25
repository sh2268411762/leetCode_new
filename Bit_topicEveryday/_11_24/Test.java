package Bit_topicEveryday._11_24;


class B {
//    public B(String s) {
//        System.out.println("B");
//    }

//    private String name = "Person";
//去掉private
    public String name = "Person";

    int age = 0;
}

public class Test extends B {
//    public Test(String s) {
//        super(s);
//        System.out.println("D");
//    }
//    public Test()
//    {
//        super("s");
//    }
    static void fun()
    {
        System.out.println("类方法");
    }
    void fun2()
    {
        fun();
    }
    public String grade;

    public static void main(String[] args) {
        B b = new Test();
        System.out.println(b.name);
    }



    public static void main3(String[] args) {
        Test t = new Test();
        t.fun2();
    }

    public static void main2(String[] args) {
        System.out.println("C");
    }

    public static void main1(String[] args) {
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.out.println(str1 == str2);
    }
}
