package Bit_topicEveryday._12_07;

public class test {
    public static void main(String[] args) {
        String s1 = "abc" + "def";
        String s2 = new String(s1);
        if (s1.equals(s2)) {
            System.out.println("1");
        }
        if (s1 == s2) {
            System.out.println(2);
        }
    }

    public static void main1(String[] args) {
        System.out.println(fun1(4));
    }

    public static int fun1(int x) {
        int j = 1;
        switch (x) {
            case 1:
                j++;
            case 2:
                j++;
            case 3:
                j++;
            case 4:
                j++;
            case 5:
                j++;
            default:
                j++;
        }
        return j + x;
    }

}
