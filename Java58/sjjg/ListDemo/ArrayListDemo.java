package Java58.sjjg.ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        //构造一个初始容量为10的空列表
        List<String> list1 = new ArrayList<>();

        //用集合构造
        List<String> list2 = Arrays.asList(
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"
        );
        List<String> list3 = new ArrayList<>(list2);
        System.out.println(list3.get(3));
        System.out.println(list3);
        System.out.println(list3.subList(2, 6));


        //构造的时候指定容量
        List<String> list4 = new ArrayList<>(100);
        //错误语句：初始容量是100，但是元素有效个数是0个，运行下一行语句会报数组越界异常
        list4.add("99");
        System.out.println(list4.get(0));
        list4.set(0, "Hello");
        System.out.println(list4.get(0));
    }
}
