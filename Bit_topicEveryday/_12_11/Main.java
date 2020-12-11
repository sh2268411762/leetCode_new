package Bit_topicEveryday._12_11;

public class Main {
    public static void main(String[] args) {
        int moneyR = 0, moneyS = 0;
        for (int i = 1; i <= 30; i++) {
            moneyR += 10;
            moneyS += (int) Math.pow(2, i - 1);
        }
        System.out.println(moneyR + " " + moneyS);
    }
}
