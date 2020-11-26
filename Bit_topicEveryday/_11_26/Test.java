package Bit_topicEveryday._11_26;

public class Test {
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    Test(int x) {
        System.out.println("x");
    }

    Test() {
        //this(5);
        //super(5);   调用父类构造方法
        //Test(5);    加new
    }


    public static void main(String[] args) {
        //Test t = new Test();
        int x, y;
        x = 5 >> 2;
        y = x >>> 2;
        System.out.println(y);
    }

    public static void main3(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("2");
            }
        });
        t.start();

        t.join();
        System.out.println("1");
    }

    public static void main2(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        fun(a, b);
        System.out.println(a + "." + b);
    }

    static void fun(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }


    public static void main1(String[] args) {
        Test t = new Test();
        t.change(t.str, t.ch);
        System.out.print(t.str + " and ");
        System.out.print(t.ch);
    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }

}
