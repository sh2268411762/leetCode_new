package Bit_topicEveryday._12_10;


//class X {
//    Y y = new Y();
//
//    public X() {
//        System.out.print("X");
//    }
//
//}
//
//class Y {
//    public Y() {
//        System.out.print("Y");
//    }
//
//}

public class tets {
    static boolean P;
    private int count;
    public String name = "abc";

    public static void main(String[] args) {
        tets t = new tets();
        tets tt = new tets();
        System.out.println(t.equals(tt) + "," + t.name.equals(tt.name));
    }


    public static void main4(String[] args) {
        tets t = new tets(88);
        System.out.println(t.count);
    }

    tets(int a) {
        count = a;
    }

    tets() {
    }

    public static void main3(String[] args) {
        System.out.println(P);
    }

    public static void main2(String[] args) {
        long a = 0xf000000000000000L;
        long b = 0x7fffffffffffffffL;
        System.out.println(a - b);
        System.out.println(Math.pow(2, 62) + Math.pow(2, 61) + Math.pow(2, 60) + 1);
    }
//
//    Y y = new Y();
//
//    public tets() {
//        System.out.print("Z");
//    }
//
//    public static void main1(String[] args) {
//        new tets();
//    }
}
