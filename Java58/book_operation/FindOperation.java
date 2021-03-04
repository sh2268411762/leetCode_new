package Java58.book_operation;


import Java58.book.Book;
import Java58.book.BookList;

import java.util.Scanner;

//查找图书
public class FindOperation implements IOperation
{
    @Override
    public void work(BookList bookList)
    {
        System.out.println("查找图书");
        System.out.println("请输入图书的名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        for (int i = 0; i < bookList.getUseSide(); i++)
        {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name))
            {
                System.out.println("找到了《" + name + "》");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有《" + name + "》");
    }
}
