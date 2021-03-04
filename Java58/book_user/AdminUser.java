package Java58.book_user;

import Java58.book_operation.*;

import java.util.Scanner;

public class AdminUser extends User
{
    public AdminUser(String name)
    {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisOperation()
        };
    }


    @Override
    public int menu()
    {
        System.out.println("=================================================");
        System.out.println("hello：" + this.name + "，欢迎来到豪哥图书管理系统（管理员）");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出系统");
        System.out.println("=================================================");

        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();

        return select;
    }


}
