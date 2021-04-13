package sjjg_OJ;


import java.io.*;
import java.util.*;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 旧键盘
 * @Date 2021/4/12 上午 9:56
 */
public class Test33
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        //转为大写
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        ArrayList<String> list = new ArrayList<>();

        char[] chars = str1.toCharArray();
        for (int i = 0; i < str1.length(); i++)
        {
            String s = String.valueOf(chars[i]);
            if (!str2.contains(s) && !list.contains(s))   //如果 str2 力没有，则存进去
            {
                list.add(s);
            }
        }
        for (String str : list)
        {
            System.out.print(str);
        }
    }
}
