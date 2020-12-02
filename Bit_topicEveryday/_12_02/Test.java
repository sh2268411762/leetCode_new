package Bit_topicEveryday._12_02;

class Person {
    String name = "No name";

    public Person(String nm) {
        name = nm;
    }
}

class Empolyee extends Person {
    String empID = "0000";

    public Empolyee(String id) {
        super(id);
        empID = id;
    }

}


public class Test {
    String str = new String("hello");
    char[] ch = {'a', 'b'};

    public static void main(String[] args) {
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j);
        System.out.println(j.equals(i));
    }

    private static void f() {
        System.out.println("test");
    }

    public static void main4(String[] args) {
        ((Test) null).f();
    }

    public static void main3(String[] args) {
        Test t = new Test();
        t.change(t.str, t.ch);
        System.out.print(t.str + " and ");
        System.out.print(t.ch);
    }

    public void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'c';
    }


    public static void main2(String[] args) {
        Empolyee e = new Empolyee("123");
        System.out.println(e.empID);
    }


    public static void main1(String[] args) {
        String x = "fmn";
        x.toUpperCase();
        String y = x.replace('f', 'F');
        y = y + "wxy";
        System.out.println(y);
    }
}
