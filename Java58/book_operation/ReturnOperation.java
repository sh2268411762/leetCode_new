package Java58.book_operation;


import Java58.book.Book;
import Java58.book.BookList;

import java.util.Scanner;

//归还图书
public class ReturnOperation implements IOperation
{

    @Override
    public void work(BookList bookList)
    {
        System.out.println("归还图书");
        System.out.println("请输入图书的名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        for (int i = 0; i < bookList.getUseSide(); i++)
        {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name))
            {
                if(book.isBorrowed)
                {
                    book.setBorrowed(false);
                    System.out.println("归还成功");
                }
                else
                {
                    System.out.println("归还失败");
                }
                System.out.println("归还完成");
                return;
            }
        }
        System.out.println("没有《" + name + "》这本书");
    }
}
