package Java58.string;

public class test1
{
    public static String reverse(String str, int start, int end)
    {
        char[] ch = str.toCharArray();

        while (start < end)
        {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        //return new String(ch);
        return String.copyValueOf(ch);
    }

    public static String reverse1(String str, int key)
    {
        if(str == null || key >= str.length())
        {
            return null;
        }
        str = reverse(str, 0, key - 1);  //c b a d e f g
        str = reverse(str, key, str.length() - 1);  // c b a g f e d
        str = reverse(str, 0, str.length() - 1);
        return str;
    }

    public static void main(String[] args)
    {
        //1、
        String str1 = "hello";

        //2、
        String str2 = new String("hello");

        //3、
        char[] value = {'a', 'b', 'c', 'd'};
        String str3 = new String(value);

        String str4 = "abcdefg";
        System.out.println(str4);
        str4 = reverse1(str4, 3);
        System.out.println(str4);
    }
}
