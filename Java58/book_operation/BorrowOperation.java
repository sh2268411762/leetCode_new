package Java58.book_operation;


import Java58.book.Book;
import Java58.book.BookList;

import java.util.Scanner;

//借阅图书
public class BorrowOperation implements IOperation
{
    @Override
    public void work(BookList bookList)
    {
        System.out.println("借阅图书");
        System.out.println("请输入图书的名字：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        for (int i = 0; i < bookList.getUseSide(); i++)
        {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name))
            {
                if(!book.isBorrowed)    //未被借出
                {
                    book.setBorrowed(true);
                    System.out.println("借出成功");
                }
                else
                {
                    System.out.println("借出失败");
                }
                System.out.println("借阅完成");
                return;
            }
        }
        System.out.println("没有《" + name + "》这本书");
    }
}
