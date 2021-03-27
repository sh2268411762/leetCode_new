package Java58.sjjg.ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


class Teacher
{
    String name;

    @Override
    public String toString()
    {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name);
    }



    public Teacher(String name)
    {
        this.name = name;
    }
}

public class test1
{
    public static void main(String[] args)
    {
        List<Teacher> list = new ArrayList<>();

        Teacher t1 = new Teacher("小王");
        Teacher t2 = new Teacher("小王");
        Teacher t3 = new Teacher("小孙");
        Teacher t4 = new Teacher("小孙");

        list.add(t1);
        list.add(t3);
        System.out.println(list);

        list.remove(t1);
        System.out.println(list);

        list.remove(t4);    //未重写 equals 时无法删除，重写之后可以删除
        System.out.println(list);
    }

    public static void main1(String[] args)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));

        //如果List中有该元素，则优先被当成下标使用
        list.remove(3);
        list.remove((Integer) 3);//被当成元素

        System.out.println(list);
    }
}
