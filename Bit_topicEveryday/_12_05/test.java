package Bit_topicEveryday._12_05;

public class test {

    public static void fun() {

    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.err.println(str1 == str2);
    }

    public static void add(Byte b) {
        b = b++;
    }

    public static void main1(String[] args) {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a + " ");
        add(b);
        System.out.println(b + " ");
    }

}
