package Bit_topicEveryday._12_06;

import java.util.Scanner;

public class Add {
    public String addString(String num1, String num2) {
        StringBuffer ret = new StringBuffer();
        int step = 0;
        int iL = num1.length() - 1, iR = num2.length() - 1;
        while (iL >= 0 || iR >= 0 || step == 1) {
            int l = iL >= 0 ? (num1.charAt(iL--) - '0') : 0;
            int r = iR >= 0 ? (num2.charAt(iR--) - '0') : 0;
            int p = l + r + step;
            step = p / 10;
            //char a = (char)(p % 10 + '0');
            ret.append(p % 10);
        }

        return ret.reverse().toString();
    }

    String addS(String num1, String num2) {
        if (num1.length() < num2.length()) {
            StringBuffer temp = new StringBuffer();
            temp.append(num1).append(num2);
            num2 = temp.substring(0, num1.length());
            num1 = temp.substring(num1.length());
        }
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < num1.length(); i++) {
            ret.append('0');
        }
        char step = 0;
        for (int iL = num1.length() - 1, iR = num2.length() - 1; iL >= 0; iL--, iR--) {
            char ch = (char) (num1.charAt(iL) - '0' + step);
            if (iR >= 0) {
                ch += num2.charAt(iR) - '0';
            }
            step = 0;
            if (ch >= 10) {
                step = 1;
                ch -= 10;
            }
            ret.insert(iL + 1, ch += ret.charAt(iL + 1));
        }
        if (1 == step) {
            ret.insert(0, step += ret.charAt(0));
        } else {
            ret.delete(0, 1);
        }
        return ret.toString();
    }


    public static void main(String[] args) {
        Add a = new Add();
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        System.out.println(a.addString(num1, num2));
    }
}
