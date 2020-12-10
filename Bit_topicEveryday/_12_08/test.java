package Bit_topicEveryday._12_08;

class A
{
    public A(String str){}
}
public class test {
    String str = new String("good");
    char[] ch = {'a','b','c','d'};

    public static void main(String[] args) {
        test t = new test();
        t.change(t.str,t.ch);
        System.out.print(t.str + " and ");
        System.out.print(t.ch);
    }
    public void change(String str,char ch[])
    {
        str = "test ok";
        ch[0] = 'g';
    }


    public static void main3(String[] args) {
        A a = new A("he");
        A b = new A("he");
        System.out.println(a==b);
    }

    private float f = 1.0f;
    int m = 12;
    static int n = 1;
    public static void main2(String[] args) {
        test t = new test();
        //t.f=1.0;  F
        //test.m;   F
        //this.n;   F，静态函数没有this指针
    }

    public static void main1(String[] args) {
        int a = 10;
        double b = 3.14;
        double c = 'A' + a + b;
    }
}
