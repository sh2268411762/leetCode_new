package Bit_topicEveryday._12_09;

public class test {
    public static void main(String[] args) {
        int i = 5;
        int s = (i++) + (++i) + (i--) + (--i);
        System.out.println(s);
    }

    public static void main1(String[] args) {
        int i = 0, j = 0;
        if ((++i > 0) || (++j > 0)) {
            System.out.println(i + "" + j);
        }
    }
}
