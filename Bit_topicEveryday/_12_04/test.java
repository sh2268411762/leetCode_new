package Bit_topicEveryday._12_04;

import org.w3c.dom.ls.LSOutput;

public class test {
    public static void main(String[] args) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("name",null);
        map.put("name","Jack");
        System.out.println(map.size());
    }

    public static void main3(String[] args) {
        System.out.println(getValue(2));
    }
    public static int getValue(int i)
    {
        int ret = 0;
        switch(i)
        {
            case 1:
                ret = ret + i;
            case 2:
                ret = ret + i * 2;
            case 3:
                ret = ret + i * 3;
        }
        return ret;
    }

    public static void main2(String[] args) {
        Thread t = new Thread()
        {
            public void run()
            {
                pong();
            }
        };
        t.run();
        System.out.println("ping");
    }
    static void pong()
    {
        System.out.println("pong");
    }

    String str = new String("good");
    char[] ch = {'a','b','c'};


    public static void main1(String[] args) {
        test t = new test();
        change(t.str,t.ch);
        System.out.print(t.str + " and ");
        System.out.print(t.ch);
    }
    public static void change(String str,char ch[])
    {
        str = "test ok";
        ch[0] = 'g';
    }

}
