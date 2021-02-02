package Java58;


import java.util.Arrays;

class Student implements Comparable<Student>
{
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score)
    {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o)
    {
        return Integer.compare(this.age, o.age);
    }
}


public class TestDemo1
{
    public static void main(String[] args)
    {
        Student[] s = new Student[3];
        s[0] = new Student("张三", 23, 90.9);
        s[1] = new Student("李四", 24, 89.6);
        s[2] = new Student("王五", 22, 90.5);

        System.out.println("排序前：");
        System.out.println(Arrays.toString(s));
        Arrays.sort(s);

        System.out.println("排序后：");
        System.out.println(Arrays.toString(s));

    }
}
