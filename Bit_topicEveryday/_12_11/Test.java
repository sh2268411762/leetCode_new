package Bit_topicEveryday._12_11;

public class Test {//1

    private static int x = 100;//2

    public static void main(String[] args) {//3
        Test t1 = new Test(); //4
        t1.x++;//5
        Test t2 = new Test(); //6
        t2.x++;  //7
        t1 = new Test();//8
        t1.x++;//9
        Test.x--;//10
        System.out.println("x = " + x);
    }


    public static void main2(String[] args) {
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 = Integer.valueOf(59);
        Integer i04 = new Integer(59);

        System.out.println(i03 == i04);
        System.out.println(i01 == i03);
        System.out.println(i01 == i02);
        System.out.println(i02 == i04);
    }


    public String str = "6";

    public static void main1(String[] args) {
        Test t = new Test();
        t.change(t.str);
        System.out.println(t.str);
    }

    public void change(String str) {
        str = "10";
    }

}
