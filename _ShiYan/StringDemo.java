package _ShiYan;


//字符串
public class StringDemo {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuffer str7 = new StringBuffer("hello");
        str7 = str7.append(" world----------------");
        System.out.println(str7);
        str7.append(arr, 1, 4);
        System.out.println(str7);
    }


    public static void main5(String[] args) {
        String str6 = "hello";
        str6 = str6.concat(" world");
        System.out.println(str6);
        str6 = str6.concat("!!!!!!!!!!!!!!!!!!!!!!!!1");
        System.out.println(str6);
    }


    public static void main4(String[] args) {
        String str6 = "hello";
        str6 += " world";
        System.out.println(str6);
    }

    public static void main3(String[] args) {
        String str3 = "Hello java";
        String str4 = "Hello java";
        String str5 = new String("Hello java").intern();
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);
        System.out.println(str4 == str5);

        System.out.println(str3.equals(str4));
        System.out.println(str3.equals(str5));
        System.out.println(str4.equals(str5));
    }


    public static void main2(String[] args) {
        String str3 = "Hello java";
        String str4 = "Hello java";
        String str5 = new String("Hello java");
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);
        System.out.println(str4 == str5);

        System.out.println(str3.equals(str4));
        System.out.println(str3.equals(str5));
        System.out.println(str4.equals(str5));
    }


    public static void main1(String[] args) {
        String str = "www.google.com";
        System.out.println("长度:" + str.length());
        //使用length方法求长度

        char[] arr = str.toCharArray();   //转换为字符数组
        int num1 = 0, num2 = 0;
        for (char c : arr) {
            //foreach循环遍历字符数组寻找字符 o 和字符 g
            if (c == 'o') {
                num1++;
            }
            if (c == 'g') {
                num2++;
            }
        }
        System.out.println("o的个数:" + num1 + " g的个数:" + num2);

        String str2 = str.substring(str.indexOf('g'), str.lastIndexOf('.'));
        //从 g 开始，以 . 作为分隔符进行输出google
        System.out.println(str2);
    }
}
