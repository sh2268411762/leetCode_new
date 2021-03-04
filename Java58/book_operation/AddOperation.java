package Java58.book_operation;

import Java58.book.Book;
import Java58.book.BookList;

import java.util.Scanner;

//新增图书
public class AddOperation implements IOperation
{

    @Override
    public void work(BookList bookList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("新增图书");
        System.out.println("请输入图书名字：");
        String name = sc.next();
        System.out.println("请输入作者名：");
        String author = sc.next();
        System.out.println("请输入图书的价格：");
        int price = sc.nextInt();
        System.out.println("请输入图书的类型：");
        String type = sc.next();

        for(int i=0;i<bookList.getUseSide();i++)
        {
            if(bookList.getBooks(i).name.equals(name) && bookList.getBooks(i).author.equals(author))
            {
                System.out.println("《" + name + "》已经存在，添加失败");
                return;
            }
        }
        //退出for循环说明没有该书籍

        Book book = new Book(name, author, price, type);
        int currentSize = bookList.getUseSide();
        bookList.setUseSide(bookList.getUseSide() + 1);
        bookList.setBook(currentSize, book);
        System.out.println("添加成功");


    }
}
