package Java58.bookMain;

import Java58.book.BookList;
import Java58.book_user.AdminUser;
import Java58.book_user.NormalUser;
import Java58.book_user.User;

import java.util.Scanner;

public class Main
{
    private static User login()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = sc.next();
        System.out.println("请输入你的身份(1-0)：");
        int n = sc.nextInt();

        if (n == 1)
        {
            return new AdminUser(name);
        } else
        {
            return new NormalUser(name);
        }
    }


    public static void main(String[] args)
    {
        BookList booklist = new BookList();
        User user = login();//向上转型

        while(true)
        {
            int choice = user.menu();        //动态绑定

            user.doOperation(choice, booklist);
        }
    }
}
