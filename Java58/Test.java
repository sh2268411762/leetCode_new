package Java58;

class Animal1
{
    public String name;

    public Animal1(String name)
    {
        this.name = name;
    }

    public void eat(String food)
    {
        System.out.println(this.name + "正在吃" + food);
    }
}

class Cat1 extends Animal1
{
    public Cat1(String name)
    {
        // 使用 super 调用父类的构造方法.
        super(name);
    }
}

class Bird1 extends Animal1
{
    public Bird1(String name)
    {
        super(name);
    }

    public void fly()
    {
        System.out.println(this.name + "正在飞 ︿(￣︶￣)︿");
    }
}

public class Test
{
    public static void main(String[] args)
    {
        Cat cat = new Cat("小黑");
        cat.eat("猫粮");
        Bird bird = new Bird("圆圆");
        bird.fly();
    }
}
