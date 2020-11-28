package Bit_topicEveryday._11_27;

class A {
    public A()
    {
        System.out.println("I'm A class");
    }
    static
    {
        System.out.println("static A");
    }


}


public class B extends A {
    public B()
    {
        System.out.println("I'm B class");
    }
    static
    {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        boolean b = true?false:true==true?false:true;
        System.out.println(b);
    }

    public static void main2(String[] args) {
        int num=10;
        System.out.println(test(num));
    }

    public static int test(int b)
    {
        try
        {
            b+=10;
            return b;
        }
        catch(RuntimeException e)
        {

        }
        catch(Exception e2)
        {

        }
        finally {
            b+=10;
            return b;
        }
    }


    public static void main1(String[] args) {
        new B();
    }
}
