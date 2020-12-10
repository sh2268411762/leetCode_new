package Bit_topicEveryday._12_08;


public class UnusualAdd {
    public int addAB(int A, int B) {
        int t = 0, temp = 0;
        while (B != 0) {
            t = A ^ B;
            temp = (A & B) << 1;
            A = t;
            B = temp;
        }
        return A;
    }
}
