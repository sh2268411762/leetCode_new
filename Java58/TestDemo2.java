package Java58;

class Money implements Cloneable
{
    public double money;

    public Money()
    {
        this.money = 12.5;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}


//Cloneable ：空接口，表示当前类可以继承，被克隆
class Person implements Cloneable   //浅拷贝,克隆的只是引用
{
    public String name;
    public Money m;

    public Person(String name)
    {
        this.name = name;
        this.m = new Money();
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        Person p = (Person) super.clone();
        p.m = (Money) this.m.clone();
        return p;
    }
}

public class TestDemo2
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Person p1 = new Person("张三");
        Person p2 = (Person) p1.clone();

        System.out.println(p1.m.money);
        System.out.println(p2.m.money);

        p2.m.money = 19.8;
        System.out.println(p1.m.money);
        System.out.println(p2.m.money);
    }
}
