package Bit_topicEveryday._11_25;

import java.util.Scanner;

public class buyApple
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }

    public static int count(int m)
    {
        int ret = 0;
        if(m % 2 != 0 || m == 10 || m < 6)   //奇数直接返回-1，小于6返回-1,10以上的偶数都可以取得到
        {
            return -1;
        }
        if(m % 8 == 0)   //正好为8的倍数
        {
            ret = m / 8;
        }
        else            //如果不能整除8，就要从前面的1或者2个8中拿出2个，把余数补为6（本来余数就是6，就不用拿）。所以+1
        {
            ret = 1 + m / 8;
        }
        return ret;
    }
}
