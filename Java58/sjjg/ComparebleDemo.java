package Java58.sjjg;

//Comparable

import java.util.Comparator;

class Teacher1 implements Comparable
{
    public String name;
    public int age;
    public int height;
    public int weight;

    public Teacher1(String name, int age, int height, int weight)
    {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o)
    {
        Teacher1 oo = (Teacher1) o;
//        if(this.age < oo.age)
//        {
//            return -1;
//        }
//        else if(this.age == oo.age)
//        {
//            return 0;
//        }
//        else
//        {
//            return 1;
//        }
        return Integer.compare(this.age, oo.age);
    }
}

class ByHeightCompartor implements Comparator<Teacher1>
{

    @Override
    public int compare(Teacher1 o1, Teacher1 o2)
    {
        return o1.height - o2.height;
    }
}

class ByWeightComparator implements Comparator<Teacher1>
{

    @Override
    public int compare(Teacher1 o1, Teacher1 o2)
    {
        return o1.weight - o2.weight;
    }
}


public class ComparebleDemo
{
    public static void main(String[] args)
    {
        Teacher1 t1 = new Teacher1("孙豪", 22, 106, 176);
        Teacher1 t2 = new Teacher1("王翔", 21, 180, 168);

        int ret = t1.compareTo(t2);
        if (ret < 0)
        {
            System.out.println(t1.name + "小于" + t2.name);
        } else if (ret == 0)
        {
            System.out.println(t1.name + "等于" + t2.name);
        } else
        {
            System.out.println(t1.name + "大于" + t2.name);
        }

        Comparator<Teacher1> byHeight = new ByHeightCompartor();
        Comparator<Teacher1> byWeight = new ByWeightComparator();
        //身高
        ret = byHeight.compare(t1, t2);
        System.out.println(ret);
        //体重
        ret = byWeight.compare(t1, t2);
        System.out.println(ret);
    }
}
