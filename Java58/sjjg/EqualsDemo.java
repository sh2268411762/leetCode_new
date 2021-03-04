package Java58.sjjg;

//Equals


class Teacher
{
    public String name;

    public Teacher(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        //this 不是null，检查 o 是不是null
        if (null == o) return false;

        //检查类型，不同的类型，“肯定”代表不了同一个事物
        if (!(o instanceof Teacher))
        {
            return false;
        }

        //根据我们设计累的目的，来判断是否代表同一个实物
        Teacher oo = (Teacher) o;
        return this.name.equals(oo.name);
    }

}

public class EqualsDemo
{
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher("孙豪");
        Teacher t2 = new Teacher("孙豪");
        Teacher t3 = new Teacher("王翔");
        Teacher t4 = new Teacher("王翔");
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
        System.out.println(t3.equals(t4));
    }
}
