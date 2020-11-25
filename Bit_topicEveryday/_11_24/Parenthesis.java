package Bit_topicEveryday._11_24;

import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        if (n % 2 == 1) {
            return false;
        }
        int i = 0;
        int left = 0, right = 0;
        while (i < n) {
            if (A.charAt(i) != '(' && A.charAt(i) != ')') {
                break;
            }
            if (A.charAt(i) == '(') {
                left++;
            }
            if (A.charAt(i) == ')') {
                right++;
            }
            i++;
        }
        return left == right;
    }

    public static void main(String[] args) {
        Parenthesis p = new Parenthesis();
        System.out.println(p.chkParenthesis("((()))", 6));
    }
}
