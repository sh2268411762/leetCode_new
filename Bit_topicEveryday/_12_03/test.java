package Bit_topicEveryday._12_03;

public class test {
    public static void main(String[] args) {
        try {
            int i = 100 / 0;
            System.out.print(i);
        } catch (Exception e) {
            System.out.print(1);
            throw new RuntimeException();
        } finally {
            System.out.println(2);
        }
        System.out.print(3);
    }


    public static void fun(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }

    public static void main4(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        fun(a, b);
        System.out.println(a + "," + b);
    }


    public int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("catch语句块");
        } finally {
            System.out.println("finally语句块");
        }
        return 0;
    }

    public static void main3(String[] args) {
        test t = new test();
        System.out.println("和是：" + t.add(9, 34));
    }

    public static void main2(String[] args) {
        Object o = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }

    public static void main1(String[] args) {
        byte b1 = 1, b2 = 2, b3, b6;
        final byte b4 = 4, b5 = 6;
        b6 = b4 + b5;  //10
        b3 = (byte) (b1 + b2);
    }
}
